package com.application.commerce.application_commerce.application.ports.input;

import com.application.commerce.application_commerce.domain.model.Product;

import java.util.List;

public interface ProductServicePort {

    //Consulta de producto por id
    Product findById(Long id);

    //Consulta de productos
    List<Product> findAll();

    //Inserta productos en la BD
    Product save (Product product);

    //Actualiza productos
    Product update(Long id, Product product);

    //Elimina productos por id
    void deleteById(Long id);

}
