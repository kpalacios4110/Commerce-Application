package com.application.commerce.application_commerce.infrastructure.adapters.output.persistence;

import com.application.commerce.application_commerce.application.ports.output.ClientPersistencePort;
import com.application.commerce.application_commerce.domain.model.Client;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.mapper.ClientPersistenceMapper;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.mapper.OrderPersistenceMapper;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.repository.ClientRepository;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ClientPersistenceAdapter implements ClientPersistencePort {

    private final ClientRepository repository;
    private final ClientPersistenceMapper mapper;

    @Override
    public Optional<Client> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toClient);
    }

    @Override
    public List<Client> findAll() {
        return mapper.toClientList(repository.findAll());
    }

    @Override
    public Client save(Client client) {
        return mapper.toClient(
                repository.save(mapper.toClientEntity(client)));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
