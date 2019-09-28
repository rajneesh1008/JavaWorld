package com.infosys.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.infosys.Entity.Employee;

@Repository
public class EmployeeDAO extends HibernateDaoSupport {

	@Autowired
	private SessionFactory sessionFactory;
	
	public EmployeeDAO(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}
   
	public void save(Employee employee) {
		getHibernateTemplate().save(employee);
	}
	public List<Employee>findAllEmployees() {
		return getHibernateTemplate().loadAll(Employee.class);
    }
}