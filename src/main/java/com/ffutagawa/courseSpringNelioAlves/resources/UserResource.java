package com.ffutagawa.courseSpringNelioAlves.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ffutagawa.courseSpringNelioAlves.entities.User;

@RestController
@RequestMapping (value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findall(){
		User u = new User(1L, "Fabricio", "ffutagwaa@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}
