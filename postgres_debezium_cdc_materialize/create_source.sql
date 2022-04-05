-- create source
CREATE SOURCE student
FROM KAFKA BROKER 'kafka:9092' TOPIC 'postgres.public.student' 
FORMAT AVRO USING CONFLUENT SCHEMA REGISTRY 'http://schema-registry:8081' ENVELOPE DEBEZIUM;
-- create MATERIALIZED VIEW
CREATE MATERIALIZED VIEW student_view AS
SELECT * FROM student;

-- Materialize is doing almost no compute work to respond to each query 
-- (the work is done when new data appears in Kafka) so it is 
-- perfectly fine to write polling queries
--  that run every second.

CREATE SOURCE users
FROM KAFKA BROKER 'kafka:9092' TOPIC 'postgres.public.users'
FORMAT AVRO USING CONFLUENT SCHEMA REGISTRY 'http://schema-registry:8081' ENVELOPE DEBEZIUM;

CREATE SOURCE comments
FROM KAFKA BROKER 'kafka:9092' TOPIC 'postgres.public.comments'
FORMAT AVRO USING CONFLUENT SCHEMA REGISTRY 'http://schema-registry:8081' ENVELOPE DEBEZIUM;

CREATE SOURCE campaigns
FROM KAFKA BROKER 'kafka:9092' TOPIC 'postgres.public.campaigns'
FORMAT AVRO USING CONFLUENT SCHEMA REGISTRY 'http://schema-registry:8081' ENVELOPE DEBEZIUM;




create  table users (id integer primary key, name varchar(255), email varchar(255));
create  table comments (id integer primary key, content varchar(255));
create  table campaigns (id integer primary key, name varchar(255));

Insert into users values (1, 'John', 'john@gmail.com');
Insert into comments values (1, 'this is first comment');
Insert into campaigns values (1, 'campaign 1');

CREATE MATERIALIZED VIEW users_count_view AS
SELECT COUNT(*) AS count FROM users;

CREATE MATERIALIZED VIEW users_view AS
SELECT *  FROM users;

CREATE MATERIALIZED VIEW comments_count_view AS
SELECT COUNT(*) AS count FROM comments;

CREATE MATERIALIZED VIEW campaigns_count_view AS
SELECT COUNT(*) AS count FROM campaigns;





create table campaigns (id bigint not null, statut_courant integer, name varchar(255), user_bo_id bigint, primary key (id))
create table comments (id bigint not null, contenu varchar(255), campaign_bo_id bigint, user_bo_id bigint, primary key (id))
create table users (id bigint not null, name varchar(255), primary key (id))

alter table campaigns add constraint FK4b426jrng2p6s9orv5suqfcaq foreign key (user_bo_id) references users (id)
alter table comments add constraint FKpj8nxor41yn0xs1h48crag0fb foreign key (campaign_bo_id) references campaigns (id)
alter table comments add constraint FKwl85ien2gui9q6739c7g5vnt foreign key (user_bo_id) references users (id)


