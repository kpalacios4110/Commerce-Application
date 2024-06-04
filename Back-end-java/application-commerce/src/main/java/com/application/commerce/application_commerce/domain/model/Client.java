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

public class Client {

    private Long id;
    private String name;
    private String lastname;
    private String address;
    private String email;
    private String telefono;
}
