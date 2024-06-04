package com.application.commerce.application_commerce.infrastructure.adapters.input.rest;
import com.application.commerce.application_commerce.application.ports.input.OrderServicePort;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.mapper.OrderRestMapper;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.request.OrderCreateRequest;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.response.OrderResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderRestAdapter {

    private final OrderServicePort servicePort;
    private final OrderRestMapper restMapper;

    @GetMapping("/v1/api")
    public List<OrderResponse> findAll() {
        return restMapper.toOrderResponseList(servicePort.findAll());
    }

    @GetMapping("/v1/api/{id}")
    public OrderResponse findById(@PathVariable Long id) {
        return restMapper.toOrderResponse(servicePort.findById(id));
    }

    @PostMapping("/v1/api")
    public ResponseEntity<OrderResponse> save(@Valid @RequestBody OrderCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toOrderResponse(
                        servicePort.save(restMapper.toOrder(request))));
    }

    @DeleteMapping("/v1/api/{id}")
    public void delete(@PathVariable Long id) {
        servicePort.deleteById(id);
    }
}
