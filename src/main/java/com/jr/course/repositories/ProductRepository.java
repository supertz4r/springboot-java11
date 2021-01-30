package com.jr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jr.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
