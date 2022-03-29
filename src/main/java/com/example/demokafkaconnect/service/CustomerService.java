package com.example.demokafkaconnect.service;

import io.debezium.data.Envelope;

import java.util.Map;

public interface CustomerService {
    void replicateData(Map<String, Object> customerData, Envelope.Operation operation);
}
