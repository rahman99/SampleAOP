package com.rahman.aop.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HalloService {
	
	@Value("${gettt:value that return}")
	private String name;

	public String getMessageStatus(){
		return "Hallo welcome "+this.name;
	}
}
