package com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ClientCreateRequest {

    @NotBlank(message = "El campo nombre no puede ser vacio")
    private String name;

    @NotBlank(message = "El campo apellido no puede ser vacio.")
    private String lastname;

    @NotBlank(message = "El campo direccion no puede ser vacio.")
    private String address;

    @NotBlank(message = "El campo email no puede ser vacio.")
    private String email;

    @NotBlank(message = "El campo email no puede ser vacio.")
    private String telefono;


    public @NotBlank(message = "El campo nombre no puede ser vacio") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "El campo nombre no puede ser vacio") String name) {
        this.name = name;
    }

    public @NotBlank(message = "El campo apellido no puede ser vacio.") String getLastname() {
        return lastname;
    }

    public void setLastname(@NotBlank(message = "El campo apellido no puede ser vacio.") String lastname) {
        this.lastname = lastname;
    }

    public @NotBlank(message = "El campo direccion no puede ser vacio.") String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank(message = "El campo direccion no puede ser vacio.") String address) {
        this.address = address;
    }

    public @NotBlank(message = "El campo email no puede ser vacio.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "El campo email no puede ser vacio.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "El campo email no puede ser vacio.") String getTelefono() {
        return telefono;
    }

    public void setTelefono(@NotBlank(message = "El campo email no puede ser vacio.") String telefono) {
        this.telefono = telefono;
    }
}
