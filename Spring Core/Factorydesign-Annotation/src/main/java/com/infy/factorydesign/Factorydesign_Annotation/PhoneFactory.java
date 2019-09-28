package com.infy.factorydesign.Factorydesign_Annotation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PhoneFactory {
	
	@Bean
	@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Phone phone() {
		Phone phone = new Phone();
		return new Phone();
	}

}
