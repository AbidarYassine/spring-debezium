package com.example.demokafkaconnect.consume;

import com.example.demokafkaconnect.config.MessageKafka;
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

	@KafkaListener(topics = "source_topic_users")
	public void listen(String message) {
		MessageKafka messageKafka = jsonConverter.fromJson(message, MessageKafka.class);
		log.info("userMetrics message: {}", messageKafka);
	}

}
