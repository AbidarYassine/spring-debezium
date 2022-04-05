package com.example.demokafkaconnect.service.facade;

import com.example.demokafkaconnect.bo.UserBo;

import java.util.List;

public interface UserService {
    UserBo save(UserBo customer);
    UserBo findById(Long id);
    List<UserBo> findAll();

}
