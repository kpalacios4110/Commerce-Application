package com.application.commerce.application_commerce.application.services;

import com.application.commerce.application_commerce.application.ports.input.ClientServicePort;
import com.application.commerce.application_commerce.application.ports.output.ClientPersistencePort;
import com.application.commerce.application_commerce.domain.exception.ClientNotFoundException;
import com.application.commerce.application_commerce.domain.exception.ProductNotFoundException;
import com.application.commerce.application_commerce.domain.model.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService implements ClientServicePort {

    private final ClientPersistencePort persistencePort;
    @Override
    public Client findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(ClientNotFoundException::new);
    }

    @Override
    public List<Client> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public Client save(Client client) {
        return persistencePort.save(client);
    }

    @Override
    public Client update(Long id, Client client) {
        return persistencePort.findById(id)
                .map(savedClient -> {
                    savedClient.setName(client.getName());
                    savedClient.setLastname(client.getLastname());
                    savedClient.setAddress(client.getAddress());
                    savedClient.setEmail(client.getEmail());
                    savedClient.setTelefono(client.getTelefono());
                    return persistencePort.save(savedClient);
                })
                .orElseThrow(ProductNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isEmpty()) {
            throw new ClientNotFoundException();
        }

        persistencePort.deleteById(id);
    }
}
