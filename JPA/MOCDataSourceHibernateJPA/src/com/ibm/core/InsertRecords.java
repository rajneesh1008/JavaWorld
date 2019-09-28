package com.ibm.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertRecords {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEno(15);
		employee.setName("Ramesh");
		employee.setSalary(20000d);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MOCDataSource");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
