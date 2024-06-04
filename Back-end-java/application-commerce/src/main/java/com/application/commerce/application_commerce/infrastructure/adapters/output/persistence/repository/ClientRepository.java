package com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.repository;

import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
