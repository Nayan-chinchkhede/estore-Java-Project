package com.DAO;

import java.sql.Connection;

import java.sql.DriverManager;

public class DBConnect {
	private static Connection con=null;
	private DBConnect() {}
	
	static
	{
		try
		{
			Class.forName(DBInfo.driver);
			con=DriverManager.getConnection(DBInfo.dbUrl,DBInfo.dbUname,DBInfo.dbUpwd);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static Connection getCon() {
        return con;
    }
}
