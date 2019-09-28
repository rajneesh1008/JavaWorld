package com.hcl.core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertRecords {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEmpid(8);
		employee.setEmpname("Ram");
		employee.setSalary(25000);

		Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		System.out.println(session.contains(employee));
		session.save(employee);
		System.out.println(session.contains(employee));
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
