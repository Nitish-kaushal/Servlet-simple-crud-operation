package com.ibm_servlet_simple_crud_operation.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import com.ibm_servlet_simple_crud_operation.dao.StudentDao;
import com.ibm_servlet_simple_crud_operation.dto.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;

	public class InsertStudentController extends HttpServlet
	{
	
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  StudentDao dao=new StudentDao();
	PrintWriter p =resp.getWriter();
	String FirstName=req.getParameter("FirstName");
	String LastName=req.getParameter("LastName");
	String NickName=req.getParameter("NickName");
	String Email=req.getParameter("Email");
	String Password=req.getParameter("Password");
	String Dob=req.getParameter("Dob");
	long Mobile=Long.parseLong(req.getParameter("Mobile"));
	String Gender=req.getParameter("Gender");
	String Address=req.getParameter("Address");
	
	Student student=new Student(FirstName, LastName, NickName, Email, Password,Dob, Mobile, Gender, Address);
	Student student2=dao.saveStudentDao(student);
	if(student2!=null) {
		System.out.println("Data stored");
	
	p.write("<html><body></h1 style='color:green;'>Data Stored<h1>/body></html>");
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("style1.jsp");
	dispatcher.include(req, resp);
}
}
	}
	


