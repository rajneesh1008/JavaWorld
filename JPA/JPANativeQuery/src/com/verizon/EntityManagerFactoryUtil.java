package com.verizon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtil {
	
	private static EntityManagerFactory entityManagerFactory;
	public static EntityManagerFactory createEntityManagerFactory() {
		
		if (entityManagerFactory==null) {
			entityManagerFactory=Persistence.createEntityManagerFactory("JPANativeQuery");
		}
		return entityManagerFactory;
	}
	public static EntityManager createEntityManager() {
		return createEntityManagerFactory().createEntityManager();
	}
	
	private EntityManagerFactoryUtil() {
	}

}
