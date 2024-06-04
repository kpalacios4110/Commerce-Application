package com.application.commerce.application_commerce.infrastructure.adapters.input.rest;

import com.application.commerce.application_commerce.application.ports.input.ProductServicePort;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.mapper.ProductRestMapper;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.request.ProductCreateRequest;
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
@RequestMapping("/product")

public class ProductRestAdapter {

    private final ProductServicePort servicePort;
    private final ProductRestMapper restMapper;

    @GetMapping("/v1/api")
    public List<ProductResponse> findAll() {
        return restMapper.toProductResponseList(servicePort.findAll());
    }

    @GetMapping("/v1/api/{id}")
    public ProductResponse findById(@PathVariable Long id) {
        return restMapper.toProductResponse(servicePort.findById(id));
    }

    @PostMapping("/v1/api")
    public ResponseEntity<ProductResponse> save(@Valid @RequestBody ProductCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toProductResponse(
                        servicePort.save(restMapper.toProduct(request))));
    }

    @PutMapping("/v1/api/{id}")
    public ProductResponse update(@PathVariable Long id, @Valid @RequestBody ProductCreateRequest request) {
        return restMapper.toProductResponse(
                servicePort.update(id, restMapper.toProduct(request)));
    }

    @DeleteMapping("/v1/api/{id}")
    public void delete(@PathVariable Long id) {
        servicePort.deleteById(id);
    }


}
