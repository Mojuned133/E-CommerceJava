package com.avisoft.ecommerce.repository;

import com.avisoft.ecommerce.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {

//    @Query("SELECT r From Review r where r.product.id=:productId")
//    public List<Review>getAllProductsReview(@Param("productId")Long productId);

    @Query("SELECT r FROM Review r WHERE r.product.id = :productId")
    public List<Review> getAllProductsReview(@Param("productId") Long productId);

}
