package com.application.commerce.application_commerce.infrastructure.adapters.input.rest.mapper;

import com.application.commerce.application_commerce.domain.model.Client;
import com.application.commerce.application_commerce.domain.model.User;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.request.ClientCreateRequest;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.request.UserCreateRequest;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.response.ClientResponse;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface ClientRestMapper {

    Client toClient(ClientCreateRequest request);

    ClientResponse toClientResponse(Client client);

    List<ClientResponse> toClientResponseList(List<Client> clientList);

}
