package com.example.VapourwareBE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class VapourwareBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(VapourwareBeApplication.class, args);
	}

}
