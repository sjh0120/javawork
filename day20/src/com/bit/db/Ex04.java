package com.bit.db;

import java.sql.*;

public class Ex04 {
	
	public static void printList() {
		String sql="select * from dept";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			conn=Ex02.getConnection();
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
//			while(rs.next()) {
//				
//			}
			
			/*
			//String sql="select count(*) from dept"; //일 경우
			if(rs.next()) {
				System.out.println(Ex02.same(4,rs.getInt(1)));
			}
			*/
			/*
			//예상하는 값과 알고있는 정보를 비교하는 경우_1
			if(rs.next()) {
				System.out.println(rs.getString(1).equals("10"));
				System.out.println(rs.getString(2).equals("ACCOUNTING"));
				System.out.println(rs.getString(3).equals("NEW YORK"));
			}
			*/
			//예상하는 값과 알고있는 정보를 비교하는 경우_2
			if(rs.next()) {
				System.out.println(Ex02.equals("10",rs.getString(1)));
				System.out.println(Ex02.equals("ACCOUNTING",rs.getString(2)));
				System.out.println(Ex02.equals("NEW YORK",rs.getString(3)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		printList();
		
	}

}
