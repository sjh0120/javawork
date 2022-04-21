package com.bit.day08;

import java.util.Date;
import java.text.DateFormat;

public class Ex07 {

	public static void main(String[] args) {
		Date d1=new Date();//Ex08이랑 섞임 별상관없을듯
		//d1.setYear(2002-1900);
		//d1.setMonth(5-1);
		
//		System.out.println(d1);
//		System.out.println(d1.getYear()+1900 + "년");
//		System.out.println(d1.getMonth()+1 + "월");
//		System.out.println(d1.getDate() + "일");
//		System.out.println(d1.getHours() + "시");
//		System.out.println(d1.getMinutes() + "분");
		
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
		String msg=df.format(d1);
		System.out.println(msg);
		
	}

}
