package com.ffutagawa.courseSpringNelioAlves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ffutagawa.courseSpringNelioAlves.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
