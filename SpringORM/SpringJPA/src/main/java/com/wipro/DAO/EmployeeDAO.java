package com.wipro.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.Entity.Employee;

@Repository
public class EmployeeDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void saveEmployee(Employee employee) {
		entityManager.persist(employee);
	}

}
