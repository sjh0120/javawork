package com.bit.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex02 {
	static Logger log=Logger.getGlobal();
	
	public static Connection getConnection() {
		String url="jdbc:mysql://localhost:3306/scott";
		String user="user01";
		String password="1234";
		
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
			//DriverManager에서 필요하면 Driver를 알아서 쓴다!
			log.info(conn.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		return conn;
	}
	
	public static boolean notNull(Object obj) {
		if(obj==null) return false;
		else return true;
	}
	
	public static boolean same(int result,int target) {
		if(target==result) return true;
		else return false;
	}
	
	public static boolean equals(Object result, Object target) {
		if(result.equals(target)) return true;
		else return false;
	}
	
	
	public static void main(String[] args) {
		log.setLevel(Level.INFO);
		
//		log.info((conn!=null)+""); // true -> 객체 생성 성공!
		Scanner sc=new Scanner(System.in);
		String input=null;
		while(true) {
			System.out.print("1.보기 2.입력 3.종료>");
			input=sc.nextLine();
			if(input.equals("0")) {
				System.out.println("종료합니다");
				sc.close();
				break;
			}
			if(input.equals("1")) {
				System.out.println("--------------------------------------------------");
				System.out.println("deptno	|dname	|loc");
				System.out.println("==================================================");
				Connection conn=getConnection();
				Statement stmt=null;
				ResultSet rs=null;
				try {
					stmt=conn.createStatement();
					rs=stmt.executeQuery("select deptno,dname,loc from dept order by deptno desc");
					  
					while(rs.next()) {
						System.out.print(rs.getString(1)+"	|");
						System.out.print(rs.getString(2)+"	|");
						System.out.println(rs.getString(3));
						System.out.println("--------------------------------------------------");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						if(rs!=null)rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}else if(input.equals("2")) {
				System.out.print("deptno >");
				input="insert into dept values (" + sc.nextLine();
				System.out.print("dname >");
				input+=",'" + sc.nextLine() + "'";
				System.out.print("loc > ");
				input+=",'" + sc.nextLine() + "')";
				
				
				log.info(input);
				Connection conn=null;
				Statement stmt=null;
				
				try {
					conn=getConnection();
					stmt=conn.createStatement();
					stmt.execute(input);
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
		
		
	}

}
