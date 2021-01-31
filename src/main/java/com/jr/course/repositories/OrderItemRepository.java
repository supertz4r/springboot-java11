package com.jr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jr.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
