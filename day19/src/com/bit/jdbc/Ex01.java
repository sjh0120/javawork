package com.bit.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Ex01 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/test01";
		//protocol//[hosts][/database][?properties]
		
		//String sql="insert into bbs01 values (7,'test7', 'tester','test')";
		//String sql="update bbs01 set content='test' where num=6";
		String sql="delete from bbs01 where num=6";
		
		java.util.Properties info=new Properties();
		// io&map 특성을 동시에 지님
		info.setProperty("user", "user01");
		info.setProperty("password", "1234");
		//없는 사용자 및 비밀번호가 틀리면 sql에서 접속에러 뜨듯 에러 나옴!
		
		try {
			Driver driver=new com.mysql.cj.jdbc.Driver();
			java.sql.Connection conn=null;
			conn=DriverManager.getConnection(url, info);
//			conn=DriverManager.getConnection(url, user, password);
			//System.out.println(conn!=null); //db 접속확인
			//데이터베이스 접속완료!
			
			java.sql.Statement stmt=null;
			stmt=conn.createStatement();
			//conn을 통해 상태 받아옴!
			
			stmt.executeUpdate(sql);
			//sql문 실행 명령 통신!
			stmt.close();
			conn.close();
			System.out.println("DML 수행 성공");
			//명령 통신이므로 닫아주는게 꼭 필요!
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
