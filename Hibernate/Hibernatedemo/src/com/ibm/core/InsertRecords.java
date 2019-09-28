package com.ibm.core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecords {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEmpNo(17);
		employee.setEmpName("Mahesh");
		employee.setEmpSalary(25000d);

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(employee);

		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}
