package com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateRequest {

    @NotBlank(message = "El campo nombre no puede ser vacio")
    private String name;

    @NotBlank(message = "El campo usuario no puede ser vacio")
    private String usuario;

    @NotBlank(message = "El campo contraseña no puede ser vacio")
    private String password;
}
