#!/bin/bash
input="/mounted/topic.txt"
users="users"
echo $input
while IFS= read -r line; do
  echo "$line"
done <"$input"
psql -U materialize -h materialized -p 6875 -d materialize <<EOF
CREATE SOURCE $users
FROM KAFKA BROKER 'kafka:9092' TOPIC 'postgres.public.users'
FORMAT AVRO USING CONFLUENT SCHEMA REGISTRY 'http://schema-registry:8081' ENVELOPE DEBEZIUM;

CREATE SOURCE comments
FROM KAFKA BROKER 'kafka:9092' TOPIC 'postgres.public.comments'
FORMAT AVRO USING CONFLUENT SCHEMA REGISTRY 'http://schema-registry:8081' ENVELOPE DEBEZIUM;

CREATE SOURCE campaigns
FROM KAFKA BROKER 'kafka:9092' TOPIC 'postgres.public.campaigns'
FORMAT AVRO USING CONFLUENT SCHEMA REGISTRY 'http://schema-registry:8081' ENVELOPE DEBEZIUM;

CREATE MATERIALIZED VIEW users_view AS
SELECT *  FROM users;

CREATE MATERIALIZED VIEW comments_view AS
SELECT *  FROM comments;

CREATE MATERIALIZED VIEW campaings_view AS
SELECT *  FROM campaigns;


CREATE MATERIALIZED VIEW campaings_comments_view AS
SELECT campaigns.id as campaingId,comments.id as commentId,statut_courant,contenu
FROM campaigns,comments WHERE campaigns.id = comments.campaign_bo_id;


CREATE SINK campaings_comments_view_sink
FROM campaings_comments_view
INTO KAFKA BROKER 'kafka' TOPIC 'campaings_comments_view_sink'
FORMAT AVRO USING
    CONFLUENT SCHEMA REGISTRY 'http://schema-registry:8081';

select * from campaings_view;
EOF
