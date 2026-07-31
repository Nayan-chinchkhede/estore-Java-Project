package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Bean.ProductBean;



public class UpdateProductServletDAO {

	public int updateProduct(ProductBean pb) {

		int rowCount = 0;

		try {

			Connection con = DBConnect.getCon();

			PreparedStatement pstmt =
					con.prepareStatement(
					"UPDATE PRODUCTSS SET PQTY=? WHERE PCODE=?");pstmt.setString(1, pb.getpQty());
			pstmt.setString(2, pb.getpCode());

			rowCount = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return rowCount;
	}
}