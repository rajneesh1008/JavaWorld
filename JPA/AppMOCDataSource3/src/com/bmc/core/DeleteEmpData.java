package com.bmc.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteEmpData {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AppMOCDataSource3");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee = entityManager.find(Employee.class, 17l);
		if (employee != null) {
			entityManager.remove(employee);

		}
        entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
