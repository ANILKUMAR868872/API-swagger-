package com.example.Kumar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
    info = @Info(title = "My API", version = "1.0", description = "API Documentation")
)
@SpringBootApplication
public class KumarApplication {

	public static void main(String[] args) {
		SpringApplication.run(KumarApplication.class, args);
	}

}