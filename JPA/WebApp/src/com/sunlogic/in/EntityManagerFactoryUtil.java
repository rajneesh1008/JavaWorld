package com.sunlogic.in;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtil {

	private static EntityManagerFactory entityManagerFactory;

	private EntityManagerFactoryUtil() {
	}
	
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("WebApp");
	}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		System.out.println("Returning EntityManagerFactory Object");
		return entityManagerFactory;
		
	}
	public static EntityManager  getEntityManager() {
		System.out.println("Returning EntityManager Object");
		return entityManagerFactory.createEntityManager();
	}
}
