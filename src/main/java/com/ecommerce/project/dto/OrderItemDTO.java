package com.ecommerce.project.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrderItemDTO {

    private String productName;

    private double productPrice;

    private int quantity;
}
