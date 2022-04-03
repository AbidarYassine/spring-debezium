package com.example.demokafkaconnect.dao;

import com.example.demokafkaconnect.bo.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}