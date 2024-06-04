package com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.mapper;
import com.application.commerce.application_commerce.domain.model.Order;
import com.application.commerce.application_commerce.domain.model.User;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.entity.OrderEntity;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderPersistenceMapper {

    OrderEntity toOrderEntity(Order order);

    Order toOrder(OrderEntity entity);

    List<Order> toOrderList(List<OrderEntity> entityList);
}
