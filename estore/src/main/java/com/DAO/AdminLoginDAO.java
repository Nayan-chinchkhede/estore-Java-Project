
package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Bean.AdminBean;

public class AdminLoginDAO {
 
	
public AdminBean checkAdminLogin(String username,String password)
{
	
	AdminBean abean=null;
	try
	{
	Connection	con=DBConnect.getCon();
	
	PreparedStatement pstmt=con.prepareStatement("select * from ADMIN where  UNAME =? and PWD=?");
	
	
	pstmt.setString(1, username);
	pstmt.setString(2, password);
ResultSet rs=pstmt.executeQuery();

if(rs.next())
{
	abean=new AdminBean();
	abean.setaUname(rs.getString(1));
	abean.setApword(rs.getString(2));
	abean.setAfname(rs.getString(3));
	abean.setAlname(rs.getString(4));
	abean.setAddr(rs.getString(5));
	abean.setAmid(rs.getString(6));
	abean.setAphno(rs.getString(7));
}
	}
catch(Exception e)
{
	e.printStackTrace();
	
}
	return abean;	
}
}