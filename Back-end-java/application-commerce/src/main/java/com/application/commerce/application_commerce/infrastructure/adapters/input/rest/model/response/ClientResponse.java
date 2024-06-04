package com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ClientResponse {

    private Long id;
    private String name;
    private String lastname;
    private String address;
    private String email;
    private String telefono;
}
