package com.application.commerce.application_commerce.application.ports.input;

import com.application.commerce.application_commerce.domain.model.Client;

import java.util.List;

public interface ClientServicePort {

    //Consulta de clientes por id
    Client findById(Long id);

    //Consulta de clientes
    List<Client> findAll();

    //Inserta clientes en la BD
    Client save (Client client);

    //Actualiza clientes
    Client update(Long id, Client client);

    //Elimina clientes por id
    void deleteById(Long id);

}
