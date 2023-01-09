package com.erdemnayin.modelmapper.repository;

import com.erdemnayin.modelmapper.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
