package com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreateRequest {

    @NotBlank(message = "El campo nombre no puede ser vacio")
    private String name;

    @NotBlank(message = "El campo categoria no puede ser vacio.")
    private String category;

    @NotNull(message = "El campo stock no puede ser vacio")
    private Integer stock;

    @NotNull(message = "El campo costo no puede ser vacio")
    private Double cost;
}
