package com.oracle;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class App {

	public static void main(String[] args) {
		
		EntityManager entityManager = EntityManagerFactoryUtil.createEntityManager();
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
		
	     Root<Employee> empTable = criteriaQuery.from(Employee.class);
	     criteriaQuery.where(criteriaBuilder.ge(empTable.get("salary"),20000));
		
		TypedQuery<Employee> typedQuery = entityManager.createQuery(criteriaQuery);
		List<Employee> empList = typedQuery.getResultList();
		empList.forEach(employee -> {
			System.out.println(employee.getEno()+""+employee.getName()+""+employee.getSalary());
		});
		entityManager.close();
	}

}
