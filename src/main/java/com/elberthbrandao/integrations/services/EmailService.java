package com.elberthbrandao.integrations.services;

import com.elberthbrandao.integrations.dto.EmailDTO;

public interface EmailService {

	void sendEmail(EmailDTO dto);
}
