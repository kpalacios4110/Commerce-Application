package com.application.commerce.application_commerce.infrastructure.adapters.input.rest;

import com.application.commerce.application_commerce.application.ports.input.ClientServicePort;
import com.application.commerce.application_commerce.application.ports.input.ProductServicePort;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.mapper.ClientRestMapper;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.mapper.ProductRestMapper;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.request.ClientCreateRequest;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.request.ProductCreateRequest;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.response.ClientResponse;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.response.ProductResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/cliente")
public class ClientRestAdapter {

    private final ClientServicePort servicePort;
    private final ClientRestMapper restMapper;

    @GetMapping("/v1/api")
    public List<ClientResponse> findAll() {
        return restMapper.toClientResponseList(servicePort.findAll());
    }

    @GetMapping("/v1/api/{id}")
    public ClientResponse findById(@PathVariable Long id) {
        return restMapper.toClientResponse(servicePort.findById(id));
    }

    @PostMapping("/v1/api")
    public ResponseEntity<ClientResponse> save(@Valid @RequestBody ClientCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toClientResponse(
                        servicePort.save(restMapper.toClient(request))));
    }

    @PutMapping("/v1/api/{id}")
    public ClientResponse update(@PathVariable Long id, @Valid @RequestBody ClientCreateRequest request) {
        return restMapper.toClientResponse(
                servicePort.update(id, restMapper.toClient(request)));
    }

    @DeleteMapping("/v1/api/{id}")
    public void delete(@PathVariable Long id) {
        servicePort.deleteById(id);
    }

}
