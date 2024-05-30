package com.avisoft.ecommerce.service;

import com.avisoft.ecommerce.exception.ProductException;
import com.avisoft.ecommerce.model.Cart;
import com.avisoft.ecommerce.model.User;
import com.avisoft.ecommerce.request.AddItemRequest;

public interface CartService {

    public Cart createCart(User user);

    public String addCartItem(Long userId, AddItemRequest req)throws ProductException;


    public Cart findUserCart(Long userId);
}
