package com.DAO;

import java.sql.*;
import java.util.ArrayList;

import com.Bean.orderBean;

public class OrderDAO {


public ArrayList<orderBean> viewOrders(String cid)
{

ArrayList<orderBean> list=new ArrayList<>();

try
{

Connection con=DBConnect.getCon();


PreparedStatement ps=con.prepareStatement(
"select * from ORDERSS where CUST_ID=?"
);


ps.setString(1,cid);


ResultSet rs=ps.executeQuery();


while(rs.next())
{

orderBean ob=new orderBean();


ob.setOrderId(rs.getString("ORDER_ID"));

ob.setCustId(rs.getString("CUST_ID"));

ob.setPcode(rs.getString("PCODE"));

ob.setQty(rs.getString("QTY"));

ob.setAmount(rs.getString("AMOUNT"));

ob.setDate(rs.getString("ORDER_DATE"));


list.add(ob);

}


}
catch(Exception e)
{
e.printStackTrace();
}


return list;

}

}