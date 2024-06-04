package com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.mapper;

import com.application.commerce.application_commerce.domain.model.Client;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.entity.ClientEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientPersistenceMapper {

    ClientEntity toClientEntity(Client client);

    Client toClient(ClientEntity entity);

    List<Client> toClientList(List<ClientEntity> entityList);
}
