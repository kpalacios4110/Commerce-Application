package com.application.commerce.application_commerce.infrastructure.adapters.output.persistence;

import com.application.commerce.application_commerce.application.ports.output.UserPersistencePort;
import com.application.commerce.application_commerce.domain.model.User;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.mapper.OrderPersistenceMapper;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.mapper.UserPersistenceMapper;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.repository.OrderRepository;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserPersistenceAdapter implements UserPersistencePort {

    private final UserRepository repository;
    private final UserPersistenceMapper mapper;

    @Override
    public User save(User user) {
        return mapper.toUser(
                repository.save(mapper.toUserEntity(user)));
    }
}
