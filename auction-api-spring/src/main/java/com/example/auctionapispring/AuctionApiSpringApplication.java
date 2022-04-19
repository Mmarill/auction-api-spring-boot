package com.example.auctionapispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AuctionApiSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuctionApiSpringApplication.class, args);
	}

}
