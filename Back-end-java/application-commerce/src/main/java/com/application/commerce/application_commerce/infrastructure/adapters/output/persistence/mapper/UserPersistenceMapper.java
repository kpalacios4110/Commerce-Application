package com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.mapper;
import com.application.commerce.application_commerce.domain.model.Client;
import com.application.commerce.application_commerce.domain.model.User;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.entity.ClientEntity;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserPersistenceMapper {

    UserEntity toUserEntity(User user);

    User toUser(UserEntity entity);

    List<User> toUserList(List<UserEntity> entityList);
}
