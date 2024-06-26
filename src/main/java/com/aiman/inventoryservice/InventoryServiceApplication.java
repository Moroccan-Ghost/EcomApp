package com.aiman.inventoryservice;

import com.aiman.inventoryservice.entities.Product;
import com.aiman.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Computer").price(50000).quantity(12).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Printer").price(3000).quantity(5).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Phoone").price(7000).quantity(20).build());
        };
    }
}
