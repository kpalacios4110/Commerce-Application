package com.application.commerce.application_commerce.infrastructure.adapters.output.persistence;

import com.application.commerce.application_commerce.application.ports.output.ProductPersistencePort;
import com.application.commerce.application_commerce.domain.model.Product;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.mapper.ProductPersistenceMapper;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.mapper.UserPersistenceMapper;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.repository.ProductRepository;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ProductPersistenceAdapter implements ProductPersistencePort {

    private final ProductRepository repository;
    private final ProductPersistenceMapper mapper;

    @Override
    public Optional<Product> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toProduct);
    }

    @Override
    public List<Product> findAll() {
        return mapper.toProductList(repository.findAll());
    }

    @Override
    public Product save(Product product) {
        return mapper.toProduct(
                repository.save(mapper.toProductEntity(product)));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
