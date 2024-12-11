package com.proyecto.RestWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RestWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWebServiceApplication.class, args);
	}
	@RestController
	public class TestController {
    @GetMapping("/")
    public String home() {
        return "¡En Funcionamiento!";
    }
}
}
