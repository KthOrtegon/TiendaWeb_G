package com.TiendaWeb55;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.TiendaWeb55")
public class TiendaWeb55Application {

	public static void main(String[] args) {
		SpringApplication.run(TiendaWeb55Application.class, args);
	}

}
