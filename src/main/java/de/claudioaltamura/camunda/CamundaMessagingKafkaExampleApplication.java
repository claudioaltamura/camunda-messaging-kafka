package de.claudioaltamura.camunda;

import java.util.logging.Logger;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.engine.ProcessEngine;

@ProcessApplication
public class CamundaMessagingKafkaExampleApplication extends ServletProcessApplication {

	private static final Logger LOGGER = Logger.getLogger(CamundaMessagingKafkaExampleApplication.class.getName());

	@PostDeploy
	public void onDeploymentFinished(ProcessEngine processEngine) {
		LOGGER.info("CamundaMessagingKafkaExampleApplication deployment finished");
	}

}
