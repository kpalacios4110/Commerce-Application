package com.application.commerce.application_commerce.infrastructure.adapters.input.rest;


import com.application.commerce.application_commerce.application.ports.input.UserServicePort;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.mapper.UserRestMapper;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.request.UserCreateRequest;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.response.UserResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/usuario")

public class UserRestAdapter {

    private final UserServicePort servicePort;
    private final UserRestMapper restMapper;

    @PostMapping("/v1/api")
    public ResponseEntity<UserResponse> save(@Valid @RequestBody UserCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toUserResponse(
                        servicePort.save(restMapper.toUser(request))));
    }


}
