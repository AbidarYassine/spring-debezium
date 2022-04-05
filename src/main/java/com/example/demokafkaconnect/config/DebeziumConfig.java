package com.example.demokafkaconnect.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

//@Configuration
public class DebeziumConfig {

    @Value("${spring.datasource.username}")
    private String customerDbUsername;

    @Value("${spring.datasource.password}")
    private String customerDbPassword;

//    @Bean
//    public io.debezium.config.Configuration customerConnector() {
//        return io.debezium.config.Configuration.create()
//                .with("name", UUID.randomUUID().toString())
//                .with("connector.class", "io.debezium.connector.mysql.MySqlConnector")
//                .with("offset.storage", "org.apache.kafka.connect.storage.FileOffsetBackingStore")
//                .with("offset.storage.file.filename", "/tmp/offsets.dat")
//                .with("offset.flush.interval.ms", "60000")
//                .with("database.hostname", "localhost")
//                .with("database.port", "3305")
//                .with("database.user", customerDbUsername)
//                .with("database.password", customerDbPassword)
//                .with("database.dbname", "customerdb")
//                .with("database.include.list", "customerdb")
//                .with("include.schema.changes", "false")
//                .with("database.server.id", "10181")
//                .with("database.server.name", "customer-mysql-db-server")
//                .with("database.history", "io.debezium.relational.history.FileDatabaseHistory")
//                .with("database.history.file.filename", "/tmp/dbhistory.dat")
//                .build();
//    }
}
