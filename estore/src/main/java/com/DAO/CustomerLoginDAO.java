package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Bean.AdminBean;
import com.Bean.CustomerBean;

public class CustomerLoginDAO 
{
    public CustomerBean checkCustomerLogin(String username,String password)
    {
    	CustomerBean bbean=null;
    	try
    	{
    		Connection	con=DBConnect.getCon();
    	 PreparedStatement 	pstmt=con.prepareStatement("select * from Customers where  UNAME  =? and   PWARD=?");
    	 pstmt.setString(1, username);
    	 pstmt.setString(2, password);
    	 ResultSet rs=pstmt.executeQuery();
    	 if(rs.next())
    	 {
    	 	bbean=new CustomerBean();
    	 	bbean.setUname(rs.getString(1));
    	 	bbean.setUpwd(rs.getString(2));
    	 	bbean.setUfname(rs.getString(3));
    	 	bbean.setUlname(rs.getString(4));
    	 	bbean.setUaddr(rs.getString(5));
    	 	bbean.setUmail(rs.getString(6));
    	 	bbean.setUmno(rs.getString(7));
    	 }
    	 
    	 
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	return bbean;
    }
    	
}
