package com.anas.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anas.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
