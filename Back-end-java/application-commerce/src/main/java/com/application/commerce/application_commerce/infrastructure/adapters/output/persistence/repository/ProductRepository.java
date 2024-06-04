package com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.repository;

import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
