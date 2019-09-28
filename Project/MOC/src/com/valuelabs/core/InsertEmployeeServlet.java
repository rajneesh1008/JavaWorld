package com.valuelabs.core;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertEmployeeServlet")
public class InsertEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InsertEmployeeServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String eno = request.getParameter("eno");
		String name = request.getParameter("name");
		String salary = request.getParameter("salary");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hcl", "abc");
			String query = "insert into EMP_TBL values(?,?,?,?,?)";
			PreparedStatement preparedstatement = connection.prepareStatement(query);
			preparedstatement.setString(1, eno);
			preparedstatement.setString(2, name);
			preparedstatement.setString(3, salary);
			preparedstatement.setString(4, gender);
			preparedstatement.setString(5, address);
			preparedstatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setAttribute("eno", eno);
		request.setAttribute("name", name);
		request.setAttribute("salary", salary);
		request.setAttribute("gender", gender);
		request.setAttribute("address", address);

		RequestDispatcher dispatcher = request.getRequestDispatcher("empsuccess.jsp");
		dispatcher.forward(request, response);

	}

}
