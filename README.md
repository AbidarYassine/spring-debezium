# spring-debezium-kafka-materialized-views

Debezium, a platform commonly used for CDC. </br>

## Change Data Capture (CDC) is a technique and a design pattern. We often use it to replicate data between databases in real-time.

![plot](https://www.baeldung.com/wp-content/uploads/2021/04/simple-app-debezium-embedded-arch-1.png)

## Conception

![plot](./conception/conception.png)

## To start the project

(this spring boot application is connected to materialized)
after following the steps below, you can start the application. and query materialized views with
spring data jpa or we can create a sink (kafka) and consume the data.

1. clone project from github and go to the project folder.
2. run docker-compose.yml -d up.
3. setup postgresql debezium connector (run config_Debez_postgresql.cmd)  and kafka to materialize
   is connected automatically
4.  take a look at the http://localhost:8081/subjects (topics)
5. uncomment the mzcli service and run docker-compose run mzcli
6. create source in materialize ( you can check create_source.sql file )
7. Create Materialize view

   
