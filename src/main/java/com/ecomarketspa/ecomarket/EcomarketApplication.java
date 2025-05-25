package com.ecomarketspa.ecomarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class EcomarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomarketApplication.class, args);
	}
	@GetMapping("/formulario")
    public String formulario(){

        return "formulario";
    }

}
