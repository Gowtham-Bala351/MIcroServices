package com.example.CircuitBreaker.reposit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CircuitBreaker.Model.User;

@Repository
public interface CircuitRepo extends JpaRepository<User, Integer>{

}
