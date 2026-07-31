package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Bean.CustomerBean;

public class CustomerRegisterDAO 
{
	public int addCustomer(CustomerBean cb)
	{
		int rowCount=0;
		
		try
		{
			Connection con=DBConnect.getCon();
		  PreparedStatement pstmt=con.prepareStatement("INSERT INTO CUSTOMERS VALUES(?,?,?,?,?,?,?)");
		  pstmt.setString(1, cb.getUname());
          pstmt.setString(2, cb.getUpwd());
          pstmt.setString(3, cb.getUfname());
          pstmt.setString(4, cb.getUlname());
          pstmt.setString(5, cb.getUaddr());
          pstmt.setString(6, cb.getUmail());
          pstmt.setString(7, cb.getUmno());
         rowCount= pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}

}
