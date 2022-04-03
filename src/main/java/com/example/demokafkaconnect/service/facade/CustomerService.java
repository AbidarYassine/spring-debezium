package com.example.demokafkaconnect.service.facade;

import com.example.demokafkaconnect.bo.Customer;
import io.debezium.data.Envelope;

import java.util.List;
import java.util.Map;

public interface CustomerService {
    Customer save(Customer customer);
    Customer findById(Long id);
    List<Customer> findAll();

}
