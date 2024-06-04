package com.ffutagawa.courseSpringNelioAlves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ffutagawa.courseSpringNelioAlves.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
//implementações padrões não precisa popular interface
	
}
