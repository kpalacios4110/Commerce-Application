package com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.repository;

import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
