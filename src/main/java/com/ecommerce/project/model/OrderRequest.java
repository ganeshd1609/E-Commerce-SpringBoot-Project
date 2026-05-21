package com.ecommerce.project.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;


@Getter
@Setter
public class OrderRequest {

    private Map<Long,Integer> productQuantities;

    private double totalAmount;
}
