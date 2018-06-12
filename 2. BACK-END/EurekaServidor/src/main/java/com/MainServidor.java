package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
 * @author Ismael Martin
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class MainServidor {

	public static void main(String[] args) {
		SpringApplication.run(MainServidor.class, args);
	}
}
