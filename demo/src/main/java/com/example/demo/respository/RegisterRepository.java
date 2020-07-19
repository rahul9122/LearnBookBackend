package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.RegisterEntity;

public interface RegisterRepository extends JpaRepository<RegisterEntity, Integer> {
	
	@Query(value = "SELECT * FROM register r WHERE r.email = ?1 and r.password =?2", nativeQuery = true)
			RegisterEntity findByEmailAndPassword(String email, String password);
 
}
