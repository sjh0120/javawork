package com.bit.db;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.cj.jdbc.Driver;

public class Ex01 {

	public static void main(String[] args) {
		Logger log=Logger.getGlobal();
		log.setLevel(Level.INFO);
//		log.setLevel(Level.WARNING);
//		log.setLevel(Level.SEVERE);
		
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			log.info("정보 : info");	// 메세지 전달
			log.severe("심각 : severe");	// 심각한 에러
			log.warning("경고 : warning");	// 주의
//			log.fine("로그메세지fine");
//			log.finer("로그메세지finer");
//			log.config("로그메세지config");
//			log.finest("로그메세지finest");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
