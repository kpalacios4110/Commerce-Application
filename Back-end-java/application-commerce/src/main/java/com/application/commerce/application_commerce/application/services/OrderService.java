package com.application.commerce.application_commerce.application.services;

import com.application.commerce.application_commerce.application.ports.input.OrderServicePort;
import com.application.commerce.application_commerce.application.ports.output.OrderPersistencePort;
import com.application.commerce.application_commerce.domain.exception.OrderNotFoundException;
import com.application.commerce.application_commerce.domain.exception.ProductNotFoundException;
import com.application.commerce.application_commerce.domain.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService implements OrderServicePort {

    private final OrderPersistencePort persistencePort;

    @Override
    public Order findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(OrderNotFoundException::new);
    }

    @Override
    public List<Order> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public Order save(Order order) {
        return persistencePort.save(order);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isEmpty()) {
            throw new OrderNotFoundException();
        }

        persistencePort.deleteById(id);
    }
}
