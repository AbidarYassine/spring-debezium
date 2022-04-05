package com.example.demokafkaconnect.service.impl;

import com.example.demokafkaconnect.bo.UserBo;
import com.example.demokafkaconnect.dao.UserRepository;
import com.example.demokafkaconnect.service.facade.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository customerRepository;

    @Override
    public UserBo save(UserBo customer) {
        return customerRepository.save(customer);
    }

    @Override
    public UserBo findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<UserBo> findAll() {
        return customerRepository.findAll();
    }
}
