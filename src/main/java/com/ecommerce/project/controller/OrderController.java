package com.ecommerce.project.controller;


import com.ecommerce.project.dto.OrderDto;
import com.ecommerce.project.model.OrderRequest;
import com.ecommerce.project.model.Orders;
import com.ecommerce.project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin("*")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @PostMapping("/place/{userID}")
    public OrderDto placeOrder(@PathVariable Long userID, @RequestBody OrderRequest orderRequest){

      return   orderService.placeOrder(userID,orderRequest.getProductQuantities(),orderRequest.getTotalAmount());

    }


    @GetMapping("/getAll")
    public List<Orders> getAll(@RequestBody Orders orders){

        return orderService.getAll(orders);

    }


}
