package com.example.paymentservicesep24.dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {

    private long id;

    private String name;
    private String category;
    private String description;
}
