package com.ecommerceclone.shopping.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceclone.shopping.application.entity.User;

public interface  AuthRepository extends JpaRepository<User, Integer> {

}
