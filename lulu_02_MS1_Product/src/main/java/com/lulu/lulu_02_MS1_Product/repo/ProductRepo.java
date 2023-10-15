package com.lulu.lulu_02_MS1_Product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulu.lulu_02_MS1_Product.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
