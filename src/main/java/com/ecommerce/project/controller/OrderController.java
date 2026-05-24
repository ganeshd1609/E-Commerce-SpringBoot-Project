package com.ecommerce.project.controller;


import com.ecommerce.project.dto.OrderDto;
import com.ecommerce.project.model.OrderRequest;
import com.ecommerce.project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@CrossOrigin("*")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @PostMapping("/place/{userID}")
    public OrderDto placeOrder(@PathVariable Long userID, @RequestBody OrderRequest orderRequest){

        orderService.placeOrder(userID,orderRequest.getProductQuantities(),orderRequest.getTotalAmount());

    }


}
