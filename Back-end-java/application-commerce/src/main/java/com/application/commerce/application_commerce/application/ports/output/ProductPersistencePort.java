package com.application.commerce.application_commerce.application.ports.output;


import com.application.commerce.application_commerce.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductPersistencePort {

    //Consulta de producto por id
    Optional <Product>findById(Long id);

    //Consulta de productos
    List<Product> findAll();

    //Inserta productos en la BD
    Product save (Product product);

    //Elimina productos por id
    void deleteById(Long id);
}
