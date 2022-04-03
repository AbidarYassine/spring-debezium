package com.example.demokafkaconnect.config;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class SendMessage {

    private final Gson jsonConverter;

    public SendMessage(Gson jsonConverter) {
        this.jsonConverter = jsonConverter;
    }

    public String buildMessage(Object payload) {
        log.info("Sending message: {}", payload);
        MessageKafka messageKafka = new MessageKafka();
        messageKafka.setDate(new Date());
        messageKafka.setPayload(payload);
        messageKafka.setVersion("Version 1");
        return jsonConverter.toJson(messageKafka);
    }
}
