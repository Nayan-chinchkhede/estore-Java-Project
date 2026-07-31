package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Bean.ProductBean;



public class BuyProductDAO {

	public ProductBean getProduct(String pcode) {

		ProductBean pb = null;

		try {

			Connection con = DBConnect.getCon();

			PreparedStatement pstmt = con.prepareStatement(
					"SELECT * FROM PRODUCTSS WHERE PCODE=?");

			pstmt.setString(1, pcode);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {

				pb = new ProductBean();

				pb.setpCode(rs.getString(1));
				pb.setpName(rs.getString(2));
				pb.setpCompany(rs.getString(3));
				pb.setpPrice(rs.getString(4));
				pb.setpQty(rs.getString(5));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return pb;
	}
}