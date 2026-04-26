package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

@SpringBootApplication
public class DemoOpenTelemetryApplication {

	static void main(String[] args) {
		SpringApplication.run(DemoOpenTelemetryApplication.class, args);
	}

	@Bean
	RouterFunction<ServerResponse> routes() {
		return RouterFunctions.route()
				.GET("/", _ -> ServerResponse.ok().body("Hello, World!"))
				.build();
	}

}
