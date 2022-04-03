package com.example.demokafkaconnect.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
@ToString
@Getter
@Setter
public class MessageKafka {
    private Object payload;
    private String operation;
    private String version;
    private Date date;
}
