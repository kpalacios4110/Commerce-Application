package com.application.commerce.application_commerce.domain.model;

import lombok.*;

//Annotation de Builder
@Builder
//Annotation methods Get y Set
@Getter
@Setter
//Annotation Constructor
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    //Declaracion de variables
    private Long id;
    private String name,category;
    private Integer stock;
    private Double cost;
}
