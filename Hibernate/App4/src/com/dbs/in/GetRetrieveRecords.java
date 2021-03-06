package com.dbs.in;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetRetrieveRecords {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Employee employee = session.get(Employee.class,8l);
		System.out.println(employee.getEmpid());
		System.out.println(employee.getEmpname());
		System.out.println(employee.getSalary());
		System.out.println(session.contains(employee));

		session.close();
		sessionFactory.close();

	}

}
