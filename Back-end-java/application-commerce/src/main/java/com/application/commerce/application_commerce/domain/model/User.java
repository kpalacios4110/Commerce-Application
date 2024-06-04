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

public class User {

    private Long id;
    private String name;
    private String usuario;
    private String password;

}
