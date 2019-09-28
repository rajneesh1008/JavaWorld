package com.verizon.core;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App2 {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPQLCrud");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String query = "select e from Employee e where e.salary>?1 and e.salary<?2";
		TypedQuery<Employee> typedQuery = entityManager.createQuery(query, Employee.class);
		typedQuery.setParameter(1, 10000d);
		typedQuery.setParameter(2, 20000d);
		List<Employee> empList = typedQuery.getResultList();
		empList.forEach(employee -> System.out.println(employee));

		entityManager.close();
		entityManagerFactory.close();
	}

}
