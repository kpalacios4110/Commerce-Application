package com.application.commerce.application_commerce.application.services;

import com.application.commerce.application_commerce.application.ports.input.ProductServicePort;
import com.application.commerce.application_commerce.application.ports.output.ProductPersistencePort;
import com.application.commerce.application_commerce.domain.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.application.commerce.application_commerce.domain.exception.ProductNotFoundException;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ProductService implements ProductServicePort {

    private final ProductPersistencePort persistencePort;

    @Override
    public Product findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(ProductNotFoundException::new);
    }

    @Override
    public List<Product> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public Product save(Product product) {
        return persistencePort.save(product);
    }

    @Override
    public Product update(Long id, Product product) {
        return persistencePort.findById(id)
                .map(savedProduct -> {
                    savedProduct.setName(product.getName());
                    savedProduct.setCost(product.getCost());
                    savedProduct.setCategory(product.getCategory());
                    savedProduct.setStock(product.getStock());
                    return persistencePort.save(savedProduct);
                })
                .orElseThrow(ProductNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isEmpty()) {
            throw new ProductNotFoundException();
        }

        persistencePort.deleteById(id);
    }
}
