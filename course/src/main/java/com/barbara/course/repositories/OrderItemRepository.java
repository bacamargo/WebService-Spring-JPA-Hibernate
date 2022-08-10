package com.barbara.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbara.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
