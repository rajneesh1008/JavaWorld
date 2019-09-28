package com.ibm.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateRecords {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Employee employee = session.load(Employee.class, 8l);
		if (employee != null) {
			employee.setEmpname("Jhonson");
			System.out.println(session.isDirty());
			
		}
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
