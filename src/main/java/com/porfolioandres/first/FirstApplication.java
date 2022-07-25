package com.porfolioandres.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = "com.netsurfingzone.*")
//@EntityScan("com.porfolioandres.first.*")
//@EnableJpaRepositories(basePackages = "com.porfolioandres.first.repository")
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

}
