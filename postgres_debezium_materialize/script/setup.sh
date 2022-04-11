#!/bin/bash
psql -U materialize -h materialized -p 6875 -d materialize <<EOF
CREATE SOURCE users
FROM KAFKA BROKER 'kafka:9092' TOPIC 'postgres.public.users'
FORMAT AVRO USING CONFLUENT SCHEMA REGISTRY 'http://schema-registry:8081' ENVELOPE DEBEZIUM;

CREATE SOURCE comments
FROM KAFKA BROKER 'kafka:9092' TOPIC 'postgres.public.comments'
FORMAT AVRO USING CONFLUENT SCHEMA REGISTRY 'http://schema-registry:8081' ENVELOPE DEBEZIUM;

CREATE SOURCE campaigns
FROM KAFKA BROKER 'kafka:9092' TOPIC 'postgres.public.campaigns'
FORMAT AVRO USING CONFLUENT SCHEMA REGISTRY 'http://schema-registry:8081' ENVELOPE DEBEZIUM;
EOF
