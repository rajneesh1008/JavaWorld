package com.verizon.core;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App1 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPQLCrud");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String JPQLquery = "select e from Employee e where e.salary>16000";
		TypedQuery<Employee> typedQuery = entityManager.createQuery(JPQLquery, Employee.class);
		List<Employee> empList = typedQuery.getResultList();
		empList.forEach(employee -> System.out.println(employee));

		entityManager.close();
		entityManagerFactory.close();
	}
}
