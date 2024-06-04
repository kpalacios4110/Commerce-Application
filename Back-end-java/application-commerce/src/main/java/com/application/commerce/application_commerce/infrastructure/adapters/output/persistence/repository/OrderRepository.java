package com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.repository;

import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
