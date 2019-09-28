package com.verizon;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class App {

	public static void main(String[] args) {
		EntityManager entityManager = EntityManagerFactoryUtil.createEntityManager();
		String sql=" select * from EMP_TBL";
		Query query = entityManager.createNativeQuery(sql,Employee.class);
		List empList = query.getResultList();
		for (Object object : empList) {
           Employee employee=(Employee)object;
           System.out.println(employee.getEno());
           System.out.println(employee.getName());
           System.out.println(employee.getSalary());
		}
		entityManager.close();
	}

}
