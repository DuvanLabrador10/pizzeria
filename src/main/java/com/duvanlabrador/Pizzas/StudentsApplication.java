package com.duvanlabrador.Pizzas;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsApplication {

	public static void main(String[] args) {
		SpringApplication app  = new SpringApplication(StudentsApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

}
