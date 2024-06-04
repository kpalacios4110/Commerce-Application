package com.application.commerce.application_commerce;

import com.application.commerce.application_commerce.infrastructure.adapters.output.persistence.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ApplicationCommerceApplication {


	public static void main(String[] args) {

		SpringApplication.run(ApplicationCommerceApplication.class, args);

	}

}
