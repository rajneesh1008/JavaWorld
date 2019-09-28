package com.cognizant.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RetrieveEmpRecords {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AppMOCDataSource1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, 17l);
		System.out.println(employee.getEmpid());
		System.out.println(employee.getEmpname());
		System.out.println(employee.getSalary());
		System.out.println(entityManager.contains(employee));

		entityManager.close();
		entityManagerFactory.close();
	}

}
