package com.amazon.BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class NameLenghthCheckPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(bean);
		System.out.println(beanName);
		{
			if (bean instanceof Person) {
				Person Person = (Person) bean;
				if (Person.getName().length() < 5) {
					throw new BeanCreationException("Sorry Person Object");
				}
				if (bean instanceof Address) {
					Address address = (Address) bean;
					if (address.getState().length() < 5)
						;
					throw new BeanCreationException("Sorry Address Object");

				}
			}
		}

		return bean;

	}

}
