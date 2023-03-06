package br.com.thiago.academicnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication

public class AcademicnetApplication {


	public static void main(String[] args) {
		SpringApplication.run(AcademicnetApplication.class, args);
		System.out.println("Olá Spring");
	}

}
