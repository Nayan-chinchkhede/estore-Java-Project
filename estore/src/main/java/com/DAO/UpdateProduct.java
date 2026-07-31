package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;

import com.Bean.ProductBean;

public class UpdateProduct 
{	
	public int updateProduct(ProductBean pb)
	{
		int rowCount=0;
		try
		{
			Connection con=DBConnect.getCon();
			PreparedStatement pstmt = con.prepareStatement(
		    "update productss set pprice=?, pqty=? where pcode=?");
			pstmt.setString(1,pb.getpPrice());
			pstmt.setString(2,pb.getpQty());
			pstmt.setString(3,pb.getpCode());
			rowCount=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}return rowCount;
	}

}
