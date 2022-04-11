package com.example.demokafkaconnect.web;


import com.example.demokafkaconnect.dao.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comments")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class CommentController {


    private final CommentRepository commentRepository;


}
