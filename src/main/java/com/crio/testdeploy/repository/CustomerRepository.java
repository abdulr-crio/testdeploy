package com.crio.testdeploy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crio.testdeploy.model.Customer;

public interface CustomerRepository extends JpaRepository <Customer, Long> {
    
}