package com.example.demokafkaconnect.dao;

import com.example.demokafkaconnect.bo.CommentBo;
import com.example.demokafkaconnect.bo.response.CommentResponse;

import java.util.List;


public interface CommentRepository {


    List<CommentResponse> findAll();

}
