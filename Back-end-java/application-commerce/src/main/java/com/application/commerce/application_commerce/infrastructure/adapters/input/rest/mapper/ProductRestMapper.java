package com.application.commerce.application_commerce.infrastructure.adapters.input.rest.mapper;

import com.application.commerce.application_commerce.domain.model.Product;
import com.application.commerce.application_commerce.domain.model.User;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.request.ProductCreateRequest;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.request.UserCreateRequest;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.response.ProductResponse;
import com.application.commerce.application_commerce.infrastructure.adapters.input.rest.model.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductRestMapper {

    Product toProduct(ProductCreateRequest request);

    ProductResponse toProductResponse(Product product);

    List<ProductResponse> toProductResponseList(List<Product> productList);
}
