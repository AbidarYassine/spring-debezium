package com.example.demokafkaconnect.web;


import com.example.demokafkaconnect.bo.UserBo;
import com.example.demokafkaconnect.service.facade.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/")
    public UserBo save(@RequestBody UserBo customer) {
        return userService.save(customer);
    }

    @GetMapping("/{id}")
    public UserBo findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping("/")
    public List<UserBo> findAll() {
        return userService.findAll();
    }
}
