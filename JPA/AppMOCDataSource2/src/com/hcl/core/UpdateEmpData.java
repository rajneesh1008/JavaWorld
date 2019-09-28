package com.hcl.core;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateEmpData {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AppMOCDataSource2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee = entityManager.find(Employee.class, 17l);

		if (employee != null) {

			employee.setSalary(BigDecimal.valueOf(9999));

		}

		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
