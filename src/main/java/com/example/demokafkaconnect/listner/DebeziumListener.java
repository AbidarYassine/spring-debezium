package com.example.demokafkaconnect.listner;


import lombok.extern.slf4j.Slf4j;

//@Component
@Slf4j
public class DebeziumListener {

//    private final Executor executor = Executors.newSingleThreadExecutor();
//        private final SendMessage sendMessage;
////
//    private final KafkaTemplate<String, String> kafkaTemplate;
//    private final DebeziumEngine<RecordChangeEvent<SourceRecord>> debeziumEngine;
//
//    public DebeziumListener(Configuration customerConnectorConfiguration, KafkaTemplate<String, String> kafkaTemplate, SendMessage sendMessage) {
//
//        this.debeziumEngine = DebeziumEngine.create(ChangeEventFormat.of(Connect.class)).using(customerConnectorConfiguration.asProperties()).notifying(this::handleChangeEvent).build();
////
//        this.sendMessage = sendMessage;
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    private void handleChangeEvent(RecordChangeEvent<SourceRecord> sourceRecordRecordChangeEvent) {
//        SourceRecord sourceRecord = sourceRecordRecordChangeEvent.record();
//
//        log.info("Key = '" + sourceRecord.key() + "' value = '" + sourceRecord.value() + "'");
//
//        Struct sourceRecordChangeValue = (Struct) sourceRecord.value();
//
//        if (sourceRecordChangeValue != null) {
//            Operation operation = Operation.forCode((String) sourceRecordChangeValue.get(OPERATION));
//
//            if (operation != Operation.READ) {
//                String record = operation == Operation.DELETE ? BEFORE : AFTER; // Handling Update & Insert operations.
//
//                Struct struct = (Struct) sourceRecordChangeValue.get(record);
//                Map<String, Object> payload = struct.schema().fields().stream()
//                        .map(Field::name)
//                        .filter(fieldName -> struct.get(fieldName) != null)
//                        .map(fieldName -> Pair.of(fieldName, struct.get(fieldName)))
//                        .collect(toMap(Pair::getKey, Pair::getValue));
//
//                kafkaTemplate.send("source_topic_users", sendMessage.buildMessage(payload));
//            }
//        }
//    }
//
//    @PostConstruct
//    private void start() {
//        this.executor.execute(debeziumEngine);
//    }
//
//    @PreDestroy
//    private void stop() throws IOException {
//        if (this.debeziumEngine != null) {
//            this.debeziumEngine.close();
//        }
//    }
}
