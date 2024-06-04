package com.application.commerce.application_commerce.application.ports.output;

import com.application.commerce.application_commerce.domain.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientPersistencePort {

    //Consulta de clientes por id
    Optional<Client> findById(Long id);

    //Consulta de clientes
    List<Client> findAll();

    //Inserta clientes en la BD
    Client save (Client client);

    //Elimina clientes por id
    void deleteById(Long id);
}
