package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
	public static Connection createC()
	{
		//load driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String user="root";
			String password="root";
			String url= "jdbc:mysql://localhost:3306/student_manage";
			con = DriverManager.getConnection(url, user, password);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return con;
	}

}
