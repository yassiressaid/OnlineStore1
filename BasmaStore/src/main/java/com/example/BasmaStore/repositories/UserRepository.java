package com.example.BasmaStore.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BasmaStore.entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	
	UserEntity findByEmail(String email);
	
	UserEntity findByUserId(String userId);
}
