package com.ibm_servlet_simple_crud_operation.dao;

import com.ibm_servlet_simple_crud_operation.connection.StudentConnection;
import com.ibm_servlet_simple_crud_operation.dto.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    // Method to save a Student object to the database
   
	Connection connection=StudentConnection.getStudentConnection();
	   final String INSERT_STUDENT_QUERY="INSERT INTO Students(FirstName, LastName, NickName, Email, Password, Dob, Mobile, Gender, Address) values(?,?,?,?,?,?,?,?,?,)";
	   final String DISPLAY_STUDENT_QUERY="SELECT * FROM students";
	   public Student saveStudentDao(Student student)
	   {
		   try 
		   {
			PreparedStatement ps=connection.prepareStatement(INSERT_STUDENT_QUERY);
			ps.setString(1, student.getFirstname());
			ps.setString(2, student.getLastname());
			ps.setString(3, student.getFirstname());
			ps.setString(4, student.getEmail());
			ps.setString(5, student.getPassword());
			ps.setString(6, student.getDob());
			ps.setLong(7, student.getMobile());
			ps.setString(8, student.getGender());
			ps.setString(9, student.getAddress());
			ps.execute();
			
			return student ;
		    } 
		   catch (SQLException e) 
		   {
			e.printStackTrace();
			return null;
		   }
	   }
	        public List<Student> getAllStudentDataDao()
	       {
	        	PreparedStatement ps;
				try {
					ps = connection.prepareStatement(DISPLAY_STUDENT_QUERY);
					ResultSet set=ps.executeQuery();
		        	
		        	List<Student> list=new ArrayList<Student>();
		        	while(set.next()) 
		        	{
		        		list.add(new Student(set.getInt("id"),
		        				set.getString("firstname"),
		        				set.getString("lastname"),
		        				set.getString("nickname"),
		        				set.getString("email"),
		        				set.getString("password"),
		        				set.getString("dob"),
		        				set.getLong("mobile"),
		        				set.getString("gender"),
		        				set.getString("address")
		        				));
		        		
		        	}
		        	return list;
				} 
				catch (SQLException e)
				{
					
					e.printStackTrace();
					return null;
				}
	       }
}