package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 
 * @author Ismael Martin
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainMicroservicioBackend {

	public static void main(String[] args) {
		SpringApplication.run(MainMicroservicioBackend.class, args);
	}
}
