package com.example.demokafkaconnect.dao;

import com.example.demokafkaconnect.bo.UserBo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UserBo, Long> {

    @Override
    @Query(value = "SELECT * FROM users_view", nativeQuery = true)
    List<UserBo> findAll();
}