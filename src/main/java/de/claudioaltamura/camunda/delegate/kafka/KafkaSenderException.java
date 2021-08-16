package de.claudioaltamura.camunda.delegate.kafka;

public class KafkaSenderException extends RuntimeException {

	public KafkaSenderException(String msg, Exception e) {
		super(msg, e);
	}

}
