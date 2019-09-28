package com.verizon.App;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertRecords {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpid(19);
		employee.setEmpname("RajeshKumar");
		employee.setSalary(BigDecimal.valueOf(15708));

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(employee);

		//entityManager.persist(employee);

		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
