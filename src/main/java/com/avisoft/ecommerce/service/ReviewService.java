package com.avisoft.ecommerce.service;

import com.avisoft.ecommerce.exception.ProductException;
import com.avisoft.ecommerce.model.Review;
import com.avisoft.ecommerce.model.User;
import com.avisoft.ecommerce.request.ReviewRequest;

import java.util.List;

public interface ReviewService {
    public Review createReview(ReviewRequest req, User user) throws ProductException;

    public List<Review> getAllReview(Long productId);
}
