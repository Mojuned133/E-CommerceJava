package com.avisoft.ecommerce.serviceImplimentation;

import com.avisoft.ecommerce.exception.ProductException;
import com.avisoft.ecommerce.model.Product;
import com.avisoft.ecommerce.model.Review;
import com.avisoft.ecommerce.model.User;
import com.avisoft.ecommerce.repository.ProductRepository;
import com.avisoft.ecommerce.repository.ReviewRepository;
import com.avisoft.ecommerce.request.ReviewRequest;
import com.avisoft.ecommerce.service.ProductService;
import com.avisoft.ecommerce.service.ReviewService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReviewServiceImplementation implements ReviewService {


    private ReviewRepository reviewRepository;
    private ProductService productService;
    private ProductRepository productRepository;

    public ReviewServiceImplementation(ReviewRepository reviewRepository,
                                       ProductService productService,
                                       ProductRepository productRepository){
        this.reviewRepository=reviewRepository;
        this.productService=productService;
        this.productRepository=productRepository;

    }

    @Override
    public Review createReview(ReviewRequest req, User user) throws ProductException {
        Product product=productService.findProductById(req.getProductId());

        Review review=new Review();
        review.setUser(user);
        review.setProduct(product);
        review.setReview(req.getReview());
        review.setCreatedAt(LocalDateTime.now());



        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getAllReview(Long productId) {
        return reviewRepository.getAllProductsReview(productId);
    }
}
