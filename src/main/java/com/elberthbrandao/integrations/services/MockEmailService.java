package com.elberthbrandao.integrations.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.elberthbrandao.integrations.dto.EmailDTO;

public class MockEmailService implements EmailService {

	private static Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

	public void sendEmail(EmailDTO dto) {
		LOG.info("Sending e-mail to: " + dto.getTo());
		LOG.info("E-mail sent!");
	}

}
