package com.example.orderservice.repositories;

import com.example.orderservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
public class ProductItemRepository extends JpaRepository<ProductItem, Long>{
}
