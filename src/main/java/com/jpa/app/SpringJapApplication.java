package com.jpa.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
/*
 * if spring boot application in one package and services, controllers are in
 * another package we need @ComponentScan
 */
@ComponentScan({ "com.*" })
@EntityScan( basePackages = {"com.*"} )
@EnableTransactionManagement
@EnableJpaRepositories("com.jpa.repository")
public class SpringJapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJapApplication.class, args);
	}

}
