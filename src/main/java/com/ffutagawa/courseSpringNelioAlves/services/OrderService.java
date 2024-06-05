package com.ffutagawa.courseSpringNelioAlves.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ffutagawa.courseSpringNelioAlves.entities.Order;
import com.ffutagawa.courseSpringNelioAlves.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj= repository.findById(id);
		return obj.get();

	}
}
