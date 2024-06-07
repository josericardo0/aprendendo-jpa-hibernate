package com.praticas.springboot.aprendendo_jpa_hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("model")
@ComponentScan(basePackages = {
		"repository",
		"runner"
})
public class AprendendoJpaHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(AprendendoJpaHibernateApplication.class, args);
	}

}
