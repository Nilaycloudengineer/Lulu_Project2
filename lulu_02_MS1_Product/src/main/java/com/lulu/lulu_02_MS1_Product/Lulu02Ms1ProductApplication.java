package com.lulu.lulu_02_MS1_Product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Lulu02Ms1ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lulu02Ms1ProductApplication.class, args);
	}

}
