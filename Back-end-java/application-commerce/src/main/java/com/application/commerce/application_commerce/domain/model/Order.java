package com.application.commerce.application_commerce.domain.model;
import lombok.*;

import java.util.Date;

//Annotation de Builder
@Builder
//Annotation methods Get y Set
@Getter
@Setter
//Annotation Constructor
@AllArgsConstructor
@NoArgsConstructor

public class Order {

    private Long id;
    private Integer quantity;
    private Date date;
    private Double total;

}
