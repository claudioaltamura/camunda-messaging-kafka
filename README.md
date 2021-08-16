[![Build Status](https://travis-ci.com/claudioaltamura/camunda-messaging-kafka.svg?branch=master)](https://travis-ci.com/github/claudioaltamura/camunda-messaging-kafka)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)


# camunda-messaging-kafka
Sending messages to a Kafka topic from Camunda 

A simple example as a Servlet app with Apache Kafka Clients library. 

## Build & run

Build & run

    mvn package

    docker-compose up -d

Show logs

    docker-compose logs -f camunda

Stop

    docker-compose stop

## Addresses

login

    user demo
    
    password demo

REST-API http://localhost:8090/engine-rest

Camunda Cockpit http://localhost:8090/camunda/app/cockpit

Camunda Admin http://localhost:8090/camunda/app/admin

Camunda Tasklist http://localhost:8090/camunda/app/tasklist

## Start process

Start process "Logging & Messaging Process"

    http://localhost:8090/camunda/app/tasklist/default/

Consume message

    docker run --net=camunda-messaging-kafka_default --rm -i -t quay.io/strimzi/kafka:0.23.0-kafka-2.8.0 bin/kafka-console-consumer.sh --bootstrap-server kafka:9092 --topic demo --from-beginning
