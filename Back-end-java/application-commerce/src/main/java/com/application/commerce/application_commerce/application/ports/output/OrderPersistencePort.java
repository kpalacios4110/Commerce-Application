package com.application.commerce.application_commerce.application.ports.output;

import com.application.commerce.application_commerce.domain.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderPersistencePort {

    //Consulta de pedidos por id
    Optional<Order> findById(Long id);

    //Consulta de pedidos
    List<Order> findAll();

    //Inserta pedidos en la BD
    Order save (Order order);

    //Elimina pedidos por id
    void deleteById(Long id);

}
