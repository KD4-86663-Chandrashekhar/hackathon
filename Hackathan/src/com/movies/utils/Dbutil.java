package com.movies.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbutil {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/Hackathon";
	public static final String DB_USER = "KD4-86663-chandu";
	public static final String DB_PASSWD = "chandu18";
	
	static
	{
		try {
			  Class.forName(DB_DRIVER);
			 }
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	public static Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
		return con;
	}

}
