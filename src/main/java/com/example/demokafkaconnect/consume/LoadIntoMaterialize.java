package com.example.demokafkaconnect.consume;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class LoadIntoMaterialize {

    private final Gson jsonConverter;

    @KafkaListener(topics = "campaings_comments_view_sink-u21-1649606632-1631454185934847143")
    public void listen(String message) {
//		MessageKafka messageKafka = jsonConverter.fromJson(message, MessageKafka.class);
        log.info("campaings_comments_view message: {}", message);
    }

}
