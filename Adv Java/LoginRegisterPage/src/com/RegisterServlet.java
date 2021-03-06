package com;

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

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegisterServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
		// TODO Auto-generated method stub
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		/*	String name = request.getParameter("uname");
			String password = request.getParameter("pass");
			String address = request.getParameter("add");
			String phoneNo = request.getParameter("phone");
			String emailID = request.getParameter("email");

			try {
				Class.forName("org.h2.Driver");

				Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/AdvJava", "niit", "1234");

				PreparedStatement preparedStatement = con.prepareStatement("insert into details values(?,?,?,?,?)");
				preparedStatement.setString(1, name);
				preparedStatement.setString(2, password);
				preparedStatement.setString(3, address);
				preparedStatement.setString(4, phoneNo);
				preparedStatement.setString(5, emailID);
				
				preparedStatement.executeUpdate();
				
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.html");
				requestDispatcher.forward(request, response);
				

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String name = request.getParameter("uname");
		String password = request.getParameter("pass");
		String address = request.getParameter("add");
		String phoneNo = request.getParameter("phone");
		String emailID = request.getParameter("email");

		try {
			Class.forName("org.h2.Driver");

			Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/AdvJava", "niit", "1234");

			PreparedStatement preparedStatement = con.prepareStatement("insert into details values(?,?,?,?,?)");
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, phoneNo);
			preparedStatement.setString(5, emailID);
			
			preparedStatement.executeUpdate();
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.jsp");
			requestDispatcher.forward(request, response);
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
