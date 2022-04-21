package com.bit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Ex02 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/test01";
		
		Properties info=new Properties();
		info.setProperty("user", "user01");
		info.setProperty("password", "1234");
		
		Driver driver=null;
		Connection conn=null;
		
		Statement stmt=null;
		
		String sql="select num,sub,name,content from bbs01";
		ResultSet rs=null;
		
		try {
			driver=new com.mysql.cj.jdbc.Driver();
			conn=DriverManager.getConnection(url, info);
			
			stmt=conn.createStatement();
			//stmt.executeQuery(sql);
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.print("num: "+rs.getString(1) +"\t");
				System.out.print("sub: "+rs.getString(2) +"\t");
				System.out.print("name: "+rs.getString(3) +"\t");				
				System.out.println("content: "+rs.getString(4));
				//sql 쿼리 문을 통해서 받아온 1,2,3,4번쨰 값!
				
			}
			
			//System.out.println(conn); //-> conn은 객체받아온거!
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
