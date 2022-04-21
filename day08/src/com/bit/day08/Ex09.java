package com.bit.day08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09 {

	public static void main(String[] args) {
		Date d1=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String msg=sdf.format(d1);
		System.out.println(msg);

	}

}
