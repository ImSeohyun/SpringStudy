package com.service;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class UserService implements MessageSourceAware {

	MessageSource ctx;
	
	@Override
	public void setMessageSource(MessageSource messageSource) {
		// 자동으로 messageSource 변수에 ApplicationContext가 주입된다.
		this.ctx = messageSource;
	}
	
	public void info() {
		String mesg = ctx.getMessage("greeting", null, null, Locale.KOREA);
		System.out.println(mesg);
		String mesg2 = ctx.getMessage("greeting", null, null, Locale.ENGLISH);
		System.out.println(mesg2);
	}

}
