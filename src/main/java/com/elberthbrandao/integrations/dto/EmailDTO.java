package com.elberthbrandao.integrations.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String fromEmail;
	private String fromName;
	private String replyTo;
	private String to;
	private String subject;
	private String body;
	private String contentType;
	
}
