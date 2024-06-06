package com.ffutagawa.courseSpringNelioAlves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ffutagawa.courseSpringNelioAlves.entities.Category;
import com.ffutagawa.courseSpringNelioAlves.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
