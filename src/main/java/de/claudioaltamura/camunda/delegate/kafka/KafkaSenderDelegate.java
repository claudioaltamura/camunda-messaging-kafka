package de.claudioaltamura.camunda.delegate.kafka;

import java.util.UUID;
import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import de.claudioaltamura.camunda.delegate.kafka.producer.KafkaSender;

public class KafkaSenderDelegate implements JavaDelegate {

	private static final Logger LOGGER = Logger.getLogger(KafkaSenderDelegate.class.getName());

	@Override
	public void execute(DelegateExecution delegateExecution) throws Exception {
		LOGGER.info(String.format("sending message from activity=%s", delegateExecution.getCurrentActivityName()));
		KafkaSender kafkaSender = new KafkaSender(UUID.randomUUID().toString());
		kafkaSender.send(KafkaConstants.TOPIC_NAME,
				"message xzy");
	}
}
