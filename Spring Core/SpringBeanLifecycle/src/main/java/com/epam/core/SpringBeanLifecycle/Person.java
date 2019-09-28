package com.epam.core.SpringBeanLifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.StringValueResolver;

public class Person implements BeanNameAware, InitializingBean, BeanClassLoaderAware, BeanFactoryAware,
		EnvironmentAware, EmbeddedValueResolverAware,ResourceLoaderAware,ApplicationEventPublisherAware,MessageSourceAware,ApplicationContextAware {

	private String name;

	public Person() {
		System.out.println("Person Object is Created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void init() {
		System.out.println("CustomInit()....is called");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName..." + name);

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("AfterPropertiesSet()");

	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("setBeanClassLoader.." + classLoader);

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory....." + beanFactory);

	}

	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("setEnvironment..." + environment);

	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		System.out.println("setEmbeddedValueResolver" + resolver);
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
        System.out.println("setResourceLoader"+resourceLoader);		
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		System.out.println("setApplicationEventPublisher.."+applicationEventPublisher);
		
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
      System.out.println("setMessageSource...."+messageSource);		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext..."+applicationContext);
		
	}
}
