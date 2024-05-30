package com.avisoft.ecommerce.service;

import com.avisoft.ecommerce.exception.ProductException;
import com.avisoft.ecommerce.model.Product;
import com.avisoft.ecommerce.model.Rating;
import com.avisoft.ecommerce.model.User;
import com.avisoft.ecommerce.repository.RatingRepository;
import com.avisoft.ecommerce.request.RatingRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RatingServiceImplementation implements RatingService {

    private RatingRepository ratingRepository;
    private ProductService productService;

    public RatingServiceImplementation(RatingRepository ratingRepository,ProductService productService ){

        this.productService=productService;
        this.ratingRepository=ratingRepository;
    }

    @Override
    public Rating createRating(RatingRequest req, User user) throws ProductException {
        Product product=productService.findProductById(req.getProductId());

        Rating rating=new Rating();
        rating.setProduct(product);
        rating.setUser(user);
        rating.setRating(req.getRating());
        rating.setCreatedAt(LocalDateTime.now());

        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getProductRating(Long productId) {
        return ratingRepository.getAllProductsRating(productId);
    }
}
