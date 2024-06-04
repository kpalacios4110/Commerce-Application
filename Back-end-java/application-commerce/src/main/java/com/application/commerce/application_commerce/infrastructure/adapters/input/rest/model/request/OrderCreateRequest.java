package com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class OrderCreateRequest {

    @NotNull(message = "El campo cantidad no puede ser vacio")
    private Integer quantity;

    @NotNull(message = "El campo fecha no puede ser vacio")
    private Date date;

    @NotNull(message = "El campo total no puede ser vacio")
    private Double total;

}
