package com.sunlogic.in;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AppServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmployeeServlet() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String salary = request.getParameter("salary");

		Employee employee = new Employee();
		employee.setEmpname(name);
		employee.setSalary(new BigDecimal(salary));

		EntityManager entityManager = EntityManagerFactoryUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();

		entityManager.close();

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.printf("Empid is :", employee.getEmpid() + "<br>");
		out.println("< a href=\"emp.jsp\">Add New Employee</a>");
		
		
		

	}

}
