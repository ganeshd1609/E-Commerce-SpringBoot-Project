package com.ecommerce.project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
public class OrderDto {

    private Long id;


    private double totalAmount;

    private String status;

    private Date orderDate;

    private String userName;

    private String email;

    private List <OrderItemDTO> orderItemDTOS;

}
