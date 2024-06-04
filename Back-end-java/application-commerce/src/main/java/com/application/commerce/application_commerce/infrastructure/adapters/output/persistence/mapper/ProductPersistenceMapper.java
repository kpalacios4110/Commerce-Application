package com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.mapper;
import com.application.commerce.application_commerce.domain.model.Client;
import com.application.commerce.application_commerce.domain.model.Product;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.entity.ClientEntity;
import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.entity.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface ProductPersistenceMapper {

    ProductEntity toProductEntity(Product product);

    Product toProduct(ProductEntity entity);

    List<Product> toProductList(List<ProductEntity> entityList);
}
