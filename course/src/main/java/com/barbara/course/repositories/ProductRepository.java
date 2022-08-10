package com.barbara.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbara.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
