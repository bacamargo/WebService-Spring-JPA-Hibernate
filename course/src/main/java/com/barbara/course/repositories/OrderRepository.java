package com.barbara.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbara.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
