package com.avisoft.ecommerce.service;

import com.avisoft.ecommerce.exception.ProductException;
import com.avisoft.ecommerce.model.Rating;
import com.avisoft.ecommerce.model.User;
import com.avisoft.ecommerce.request.RatingRequest;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RatingService {

    public Rating createRating(RatingRequest req, User user) throws ProductException;

    public List<Rating> getProductRating(Long productId);


}
