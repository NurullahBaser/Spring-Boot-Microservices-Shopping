package com.apes.inventoryservice;

import com.apes.inventoryservice.model.Inventory;
import com.apes.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventory = new Inventory("iphone_13", 100);
			Inventory inventory1 = new Inventory("iphone_13_red", 0);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};
	}

}
