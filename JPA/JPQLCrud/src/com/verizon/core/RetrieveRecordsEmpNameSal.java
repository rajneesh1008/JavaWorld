package com.verizon.core;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class RetrieveRecordsEmpNameSal {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPQLCrud");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		/*String query = "select e.empname,e.salary from Employee e";

		TypedQuery<Object[]> typedQuery = entityManager.createQuery(query, Object[].class);
		List<Object[]> empList = typedQuery.getResultList();
		for (Object[] objects : empList) {
			System.out.println("Employee:" + objects[0]);
			System.out.println("Employee:" + objects[1]);*/
			
			
		
		    /* String query="select e.empname from Employee e";
			TypedQuery<String> typedQuery = entityManager.createQuery(query,String.class);
			List<String> name= typedQuery.getResultList();
			System.out.println(name); */
		
		  /* String query="select e.salary from Employee e";
		  TypedQuery<BigDecimal> typedQuery = entityManager.createQuery(query,BigDecimal.class);
		  List<BigDecimal> salary = typedQuery.getResultList();
		  for (BigDecimal bigDecimal : salary) {
			  System.out.println(salary); */
		
		
	   /* String query = "SELECT max(e.salary), min(e.salary) FROM Employee e";
        TypedQuery<Object[]> typedQuery = entityManager.createQuery(query, Object[].class);
        Object[] salary = typedQuery.getSingleResult();
        System.out.println(salary[0]);
        System.out.println(salary[1]); */
		
		String query = "select max(e.salary) from Employee e";
        TypedQuery<BigDecimal> typedQuery = entityManager.createQuery(query,BigDecimal.class);
        BigDecimal salary = typedQuery.getSingleResult();
     	System.out.println(salary);
			
		
	
		   
			
		
				   
			

		

		entityManager.close();
		entityManagerFactory.close();
	}

}
