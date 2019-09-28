package com.bankofamerica.risk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrieveRecords {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Employee employee = new Employee();
		System.out.println(session.contains(employee));
		session.load(employee,8l);
		System.out.println(session.contains(employee));
		System.out.println(employee.getEmpname());

		session.close();
		sessionFactory.close();
	}

}
