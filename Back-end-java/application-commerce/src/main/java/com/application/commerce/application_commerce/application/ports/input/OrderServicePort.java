package com.application.commerce.application_commerce.application.ports.input;

import com.application.commerce.application_commerce.domain.model.Order;

import java.util.List;

public interface OrderServicePort {

    //Consulta de pedidos por id
    Order findById(Long id);

    //Consulta de pedidos
    List<Order> findAll();

    //Inserta pedidos en la BD
    Order save (Order order);

    //Elimina pedidos por id
    void deleteById(Long id);

}
