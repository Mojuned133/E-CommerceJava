package com.avisoft.ecommerce.service;


import com.avisoft.ecommerce.exception.OrderException;
import com.avisoft.ecommerce.model.Address;
import com.avisoft.ecommerce.model.Order;
import com.avisoft.ecommerce.model.User;
import com.avisoft.ecommerce.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImplementation  implements OrderService{

    private CartRepository cartRepository;
    private CartService cartService;

    private ProductService productService;



    public OrderServiceImplementation(CartRepository cartRepository, CartService cartService, ProductService productService ){


        this.cartService = cartService;
        this.cartRepository=cartRepository;
        this.productService=productService;
    }


    @Override
    public Order createOrder(User user, Address shippingAddress) {
        return null;
    }

    @Override
    public Order findOrderById(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public List<Order> usersOrderHistory(Long userId) {
        return null;
    }

    @Override
    public Order placeOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order confirmedOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order shippedOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order deliveredOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order canceledOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public void deleteOrder(Long orderId) throws OrderException {

    }
}
