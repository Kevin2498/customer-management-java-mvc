package com.tcs.ilp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	private static String Driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static String username = "c##kevin";
	private static String password = "1234";
	
	public static Connection getConnection()
	{
		Connection con = null;
		try
		{
			Class.forName(Driver);
			con = DriverManager.getConnection(url,username,password);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
	public static void closeConnection(Connection con)
	{
		if(con != null)
		{
			try
			{
				con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
