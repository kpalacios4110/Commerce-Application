package com.application.commerce.application_commerce.infrastructure.adapters.input.rest.mapper;
import com.application.commerce.application_commerce.domain.model.User;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.request.UserCreateRequest;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserRestMapper {

    User toUser(UserCreateRequest request);

    UserResponse toUserResponse(User user);


}
