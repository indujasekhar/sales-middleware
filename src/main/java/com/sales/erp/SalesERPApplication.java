package com.sales.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalesERPApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SalesERPApplication.class, args);
	}
	
	//To enable cross origin requests and to avoid CORS error
	/*@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				//Allowing access to the rest api only from the below mentioned origin
				registry.addMapping("**").allowedOrigins("*");
			}
		};
	}*/
}