-- noinspection SqlNoDataSourceInspectionForFile

-- noinspection SqlDialectInspectionForFile

-- create source
CREATE SOURCE users
FROM KAFKA BROKER 'kafka:9092' TOPIC 'postgres.public.users'
FORMAT AVRO USING CONFLUENT SCHEMA REGISTRY 'http://schema-registry:8081' ENVELOPE DEBEZIUM;

CREATE SOURCE comments
FROM KAFKA BROKER 'kafka:9092' TOPIC 'postgres.public.comments'
FORMAT AVRO USING CONFLUENT SCHEMA REGISTRY 'http://schema-registry:8081' ENVELOPE DEBEZIUM;

CREATE SOURCE campaigns
FROM KAFKA BROKER 'kafka:9092' TOPIC 'postgres.public.campaigns'
FORMAT AVRO USING CONFLUENT SCHEMA REGISTRY 'http://schema-registry:8081' ENVELOPE DEBEZIUM;
-- create source end



-- start create MATERIALIZED VIEW
CREATE MATERIALIZED VIEW users_view AS
SELECT *  FROM users;

CREATE MATERIALIZED VIEW comments_view AS
SELECT *  FROM comments;

CREATE MATERIALIZED VIEW campaings_view AS
SELECT *  FROM campaigns;

CREATE MATERIALIZED VIEW campaings_view_status AS
SELECT statut_courant, COUNT(*) FROM campaigns GROUP BY statut_courant;


CREATE MATERIALIZED VIEW campaings_count AS SELECT  COUNT(*) FROM campaigns ;

CREATE MATERIALIZED VIEW campaings_comments_view AS
SELECT campaigns.id as campaingId,comments.id as commentId,statut_courant,contenu
FROM campaigns,comments WHERE campaigns.id = comments.campaign_bo_id;

-- end create materialized view














CREATE SINK campaings_comments_view_sink
FROM campaings_comments_view
INTO KAFKA BROKER 'kafka' TOPIC 'campaings_comments_view_sink'
FORMAT AVRO USING
    CONFLUENT SCHEMA REGISTRY 'http://schema-registry:8081';



-- create MATERIALIZED VIEW end

-- Materialize is doing almost no compute work to respond to each query
-- (the work is done when new data appears in Kafka) so it is
-- perfectly fine to write polling queries
--  that run every second.






