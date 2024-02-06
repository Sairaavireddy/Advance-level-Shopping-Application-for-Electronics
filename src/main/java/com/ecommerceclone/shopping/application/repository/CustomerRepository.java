package com.ecommerceclone.shopping.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceclone.shopping.application.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
