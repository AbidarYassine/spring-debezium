package com.example.demokafkaconnect.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue
    private Long id;

    private String fullName;
    private String email;
}