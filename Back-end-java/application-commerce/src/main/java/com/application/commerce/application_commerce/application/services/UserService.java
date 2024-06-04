package com.application.commerce.application_commerce.application.services;

import com.application.commerce.application_commerce.application.ports.input.UserServicePort;
import com.application.commerce.application_commerce.application.ports.output.UserPersistencePort;
import com.application.commerce.application_commerce.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserServicePort {
    private final UserPersistencePort persistencePort;
    @Override
    public User save(User user) {
        return persistencePort.save(user);
    }
}
