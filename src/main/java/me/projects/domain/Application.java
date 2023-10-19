package me.projects.domain;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@OpenAPIDefinition(servers = {@Server(url = "/",description = "Default")})
@SpringBootApplication
@ComponentScan("me.projects")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
