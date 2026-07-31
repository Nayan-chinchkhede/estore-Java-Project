package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Bean.ProductBean;

public class AddProductDAO {

    public int addProduct(ProductBean pb)  throws Exception{

        int rowcount = 0;

        try {

            Connection con = DBConnect.getCon();

            PreparedStatement pstmt =
                    con.prepareStatement("INSERT INTO PRODUCTSS VALUES(?,?,?,?,?)");

            pstmt.setString(1, pb.getpCode());
            pstmt.setString(2, pb.getpName());
            pstmt.setString(3, pb.getpCompany());
            pstmt.setString(4, pb.getpPrice());
            pstmt.setString(5, pb.getpQty());

            rowcount = pstmt.executeUpdate();

        } 
        catch (Exception e)
        {
            throw e;
        }

        return rowcount;
    }
}
