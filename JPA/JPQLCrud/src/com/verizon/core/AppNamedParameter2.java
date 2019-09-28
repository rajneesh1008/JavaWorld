package com.verizon.core;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class AppNamedParameter2 {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPQLCrud");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String query = "select e from Employee e where e.salary>:minSalary and e.salary<:maxSalary";
		TypedQuery<Employee> typedQuery = entityManager.createQuery(query, Employee.class);

		typedQuery.setParameter("minSalary", 15000);
		typedQuery.setParameter("maxSalary", 20000);
		List<Employee> empList = typedQuery.getResultList();
		empList.forEach(employee -> System.out.println(employee));
		entityManager.close();
		entityManagerFactory.close();

	}

}
