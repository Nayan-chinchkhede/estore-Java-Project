package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;

public class DeleteProduct {
	 
	public int deleteRecord (String pcode)
	{
		int rowCount=0;
		try
		{
			Connection con=DBConnect.getCon();
		   PreparedStatement	Pstmt=con.prepareStatement("delete from productss where pcode=?");
		   Pstmt.setString(1,pcode);
		   rowCount=Pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowCount;
	}
}
