package de.claudioaltamura.camunda.delegate;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class LoggingDelegate implements JavaDelegate {

	private static final Logger LOGGER = Logger.getLogger(LoggingDelegate.class.getName());

	@Override
	public void execute(DelegateExecution delegateExecution) throws Exception {
		LOGGER.info(String.format("activity=%s", delegateExecution.getCurrentActivityName()));
	}
}
