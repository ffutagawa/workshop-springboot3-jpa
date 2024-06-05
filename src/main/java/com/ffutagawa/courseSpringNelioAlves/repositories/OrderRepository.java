package com.ffutagawa.courseSpringNelioAlves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ffutagawa.courseSpringNelioAlves.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
