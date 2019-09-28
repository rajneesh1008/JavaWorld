package com.bankofamerica.core;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class RetrieveEmployeeRecords {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPASEQDemo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		//String jpqlQuery = "select e From com.bankofamerica.core.Employee e";
		String jpqlQuery = "select e From Employee e";

		// Query query = entityManager.createQuery(jpqlQuery);
		// List<Employee> empList = query.getResultList();
		TypedQuery<Employee> typedQuery = entityManager.createQuery(jpqlQuery, Employee.class);
		List<Employee> empList = typedQuery.getResultList();
		for (Employee employee : empList) {
			System.out.println(employee);

		}
		entityManager.close();
		entityManagerFactory.close();
	}

}
