package com.ffutagawa.courseSpringNelioAlves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ffutagawa.courseSpringNelioAlves.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
