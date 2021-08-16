package de.claudioaltamura.camunda.delegate.kafka.producer;

import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import de.claudioaltamura.camunda.delegate.kafka.KafkaSenderException;

public class KafkaSender {

	private static final Logger LOGGER = Logger.getLogger(KafkaSender.class.getName());

	private Producer<Long, String> producer;

	public KafkaSender(String id) {
		producer = KafkaProducerFactory.create(id);
	}

	public void send(String topic, String msg) {
		try {
			ProducerRecord<Long, String> producerRecord = new ProducerRecord<>(topic,
					msg);
			RecordMetadata metadata = producer.send(producerRecord).get();
			LOGGER.info(String.format("Record sent to partition %s with offset %s",metadata.partition(), metadata.offset()));
		}
		catch (ExecutionException | InterruptedException e) {
			throw new KafkaSenderException("Error sending record", e);
		}
	}
}
