package com.example.demokafkaconnect.web;


import com.example.demokafkaconnect.bo.Customer;
import com.example.demokafkaconnect.service.facade.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable Long id) {
        return customerService.findById(id);
    }

    @GetMapping("/")
    public List<Customer> findAll() {
        return customerService.findAll();
    }
}
