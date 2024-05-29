package com.avisoft.ecommerce.service;

import com.avisoft.ecommerce.exception.ProductException;
import com.avisoft.ecommerce.model.Category;
import com.avisoft.ecommerce.model.Product;
import com.avisoft.ecommerce.repository.CategoryRepository;
import com.avisoft.ecommerce.repository.ProductRepository;
import com.avisoft.ecommerce.request.CreateProductRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicesImplementation implements ProductService {

    private ProductRepository productRepository;
    private UserService userService;
    private CategoryRepository categoryRepository;

    public ProductServicesImplementation(ProductRepository productRepository,
                                         UserService userService,
                                         CategoryRepository categoryRepository){
        this.productRepository=productRepository;
        this.userService=userService;
        this.categoryRepository=categoryRepository;
    }

    @Override
    public Product createProduct(CreateProductRequest req) {
        Category topLevel=categoryRepository.findByName(req.getTopLavelCategory());

        if(topLevel==null){
            Category topLavelCategory=new Category();
            topLavelCategory.setName(req.getTopLavelCategory());
            topLavelCategory.setLevel(1);

            topLevel=categoryRepository.save(topLavelCategory);
        }

        Category secondLevel=categoryRepository.findByNameAndParant(req.getSecondLavelCategory(),topLevel.getName());

        if(secondLevel==null){
            Category secondLavelCategory=new Category();
            secondLavelCategory.setName(req.getTopLavelCategory());
            secondLavelCategory.setParentCategory(topLevel);
            secondLavelCategory.setLevel(2);

            secondLevel=categoryRepository.save(secondLavelCategory);
        }

//        Category secondLevel=categoryRepository.findByName(req.getTopLavelCategory());
//
//        if(secondLevel==null){
//            Category secondLavelCategory=new Category();
//            secondLavelCategory.setName(req.getTopLavelCategory());
//            secondLavelCategory.setParentCategory(topLevel);
//            secondLavelCategory.setLevel(2);
//
//            secondLevel=categoryRepository.save(secondLavelCategory);
//        }

        return null;
    }

    @Override
    public String deleteProduct(Long productId) throws ProductException {
        return null;
    }

    @Override
    public Product updateProduct(Long productId, Product product) throws ProductException {
        return null;
    }

    @Override
    public Product findProductById(Long id) throws ProductException {
        return null;
    }

    @Override
    public List<Product> findProductByCategory(String category) {
        return null;
    }

    @Override
    public Page<Product> getAllProduct(String category, List<String> colors, List<String> sizes, Integer minPrice, Integer maxPrice, Integer minDiscount, String sort, String stock, Integer pageNumber, Integer pageSize) {
        return null;
    }
}
