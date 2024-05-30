package com.avisoft.ecommerce.service;

import com.avisoft.ecommerce.exception.CartItemException;
import com.avisoft.ecommerce.exception.UserException;
import com.avisoft.ecommerce.model.Cart;
import com.avisoft.ecommerce.model.CartItem;
import com.avisoft.ecommerce.model.Product;

public interface CartItemService {

    public CartItem createCartItem(CartItem cartItem);

    public  CartItem updateCartItem(Long userId, Long id, CartItem cartItem)throws CartItemException, UserException;

    public CartItem isCartItemExist(Cart cart, Product product, String size, Long userId);


    public void removeCartItem(Long userId, Long cartItemId) throws CartItemException, UserException;


    public CartItem findCartItemById(Long cartItemId)throws CartItemException;
}
