package com.citi.corp.SpringCore7_Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;


//@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Lazy(value=true)
@Configuration
public class Person {
    @Value("20")
	private Integer pid;
	@PostConstruct
	public void doCheck() throws Exception {
	if (pid==null) {
		throw new Exception();
	}
	}
	public Person() {
		System.out.println("Person Object is created");
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
		
		
			}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy() method is called...");
	}
	

	@Override
	public String toString() {
		return "Person [pid=" + pid + "]";
	}

}
