package com.application.commerce.application_commerce.application.ports.input;

import com.application.commerce.application_commerce.domain.model.User;

import java.util.List;

public interface UserServicePort {

    //Inserta Usuarios en la BD
    User save (User user);

}

