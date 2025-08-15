package br.com.microsservico.consumidor;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "API - Microsserviço consumidor Rabbit MQ , Cloud AMQP",
				version = "1.0",
				description = "API para cadastro de pessoas.",
				contact = @Contact(name = "Carlos Roberto", email = "crrsj1@gmail.com")
		)
)
public class MsConsumidorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConsumidorApplication.class, args);
	}

}
