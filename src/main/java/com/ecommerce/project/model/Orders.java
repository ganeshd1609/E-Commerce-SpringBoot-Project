package com.ecommerce.project.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JsonBackReference
    private User user;

    private double totalAmount;

    private String status;

    private Date orderDate;




    @OneToMany(mappedBy = "orders" ,cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

}
