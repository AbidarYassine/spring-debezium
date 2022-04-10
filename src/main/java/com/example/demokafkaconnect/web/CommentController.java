package com.example.demokafkaconnect.web;


import com.example.demokafkaconnect.bo.response.CommentResponse;
import com.example.demokafkaconnect.dao.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comments")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class CommentController {


    private final CommentRepository commentRepository;

    @CrossOrigin(value = "*", allowedHeaders = "*")
    @GetMapping("")
    public List<CommentResponse> findAll() {
        return commentRepository.findAll();
    }


}
