package com.ecommerce.project.service;

import com.ecommerce.project.dto.OrderDto;
import com.ecommerce.project.model.Orders;
import com.ecommerce.project.model.User;
import com.ecommerce.project.repo.OrderRepository;
import com.ecommerce.project.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class OrderService {


    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    public OrderDto placeOrder(Long userID, Map<Long, Integer> productQuantities, double totalAmount) {

       User user= userRepository.findById(userID)
                .orElseThrow(()->new RuntimeException("user not found"));


        Orders order= new Orders();
        order.setUser( user);
        order.setOrderDate(new Date());
        order.setStatus("pending");
        order.setTotalAmount(totalAmount);




    }

    public List<Orders> getAll(Orders orders) {

       return orderRepository.findAll();
    }
}
