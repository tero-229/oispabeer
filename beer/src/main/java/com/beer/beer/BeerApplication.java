package com.beer.beer;

import com.beer.beer.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class BeerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeerApplication.class, args);
	}

}
