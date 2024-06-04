package com.application.commerce.application_commerce.application.ports.output;

import com.application.commerce.application_commerce.domain.model.User;

public interface UserPersistencePort {
    //Inserta Usuarios en la BD
    User save (User user);

}
