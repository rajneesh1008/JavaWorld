package com.sunlogic.in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddressServlet
 */
@WebServlet("/AddressServlet")
public class AddressServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddressServlet() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String City = request.getParameter("city");
		String State = request.getParameter("state");

		Address address = new Address();
		address.setCity(City);
		address.setState(State);

		EntityManager entityManager = EntityManagerFactoryUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(address);
		entityManager.getTransaction().commit();

		entityManager.close();

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.printf("Street is :", address.getStreet() + "<br>");
		out.println("< a href=\"address.jsp\">Add New Address</a>");

	}

}
