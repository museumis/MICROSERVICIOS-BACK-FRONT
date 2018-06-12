package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 
 * @author Ismael Martin
 *
 */
@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class MainZuul {

	public static void main(String[] args) {
		SpringApplication.run(MainZuul.class, args);
	}
}
