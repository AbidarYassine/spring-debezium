package com.example.demokafkaconnect.config;

//@EnableKafka
//@Configuration
public class KafkaConsumerConfig {

//    @Bean
//    public ConsumerFactory<String, String> consumerFactory() {
//        Map<String, Object> props = new HashMap<>();
//        props.put(
//          ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
//          "localhost:9092");
//        props.put(
//          ConsumerConfig.GROUP_ID_CONFIG,
//          "group-id");
//        props.put(
//          ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
//          StringDeserializer.class);
//        props.put(
//          ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
//         StringDeserializer.class);
//        return new DefaultKafkaConsumerFactory<>(props);
//    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String,String>
//      kafkaListenerContainerFactory() {
//
//        ConcurrentKafkaListenerContainerFactory<String, String> factory =
//          new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//        return factory;
//    }
}
