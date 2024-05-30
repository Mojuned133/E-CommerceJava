package com.avisoft.ecommerce.service;

import com.avisoft.ecommerce.exception.OrderException;
import com.avisoft.ecommerce.model.Address;
import com.avisoft.ecommerce.model.Order;
import com.avisoft.ecommerce.model.User;


import java.util.List;

public interface OrderService {

    public Order createOrder(User user , Address shippingAddress);

    public Order findOrderById(Long orderId)throws OrderException;

    public List<Order> usersOrderHistory(Long userId);

    public Order placeOrder(Long orderId) throws OrderException;


    public Order confirmedOrder(Long orderId) throws OrderException;


    public Order shippedOrder(Long orderId) throws OrderException;


    public Order deliveredOrder(Long orderId) throws OrderException;



    public Order cancledOrder(Long orderId) throws OrderException;



    public List<Order>getAllOrders();


    public void deleteOrder(Long orderId) throws OrderException;
}
