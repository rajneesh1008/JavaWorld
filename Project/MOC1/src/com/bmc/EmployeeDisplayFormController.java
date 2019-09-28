package com.bmc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeDisplayFormController
 */
@WebServlet("/EmployeeDisplayFormController")
public class EmployeeDisplayFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmployeeDisplayFormController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/JSPs/Emp.jsp");
		requestDispatcher.forward(request, response);
	}

}