package com.bit.day08;

public class Ex04 {

	public static void main(String[] args) {
		java.util.Calendar cal=java.util.Calendar.getInstance();
		//객체생성이 아닌 객체를 제공받음
		//Calendar클래스가 추상클래스라서
		
		System.out.println(cal.get(java.util.Calendar.YEAR)+"년");
		System.out.println((cal.get(java.util.Calendar.MONTH)+1)+"월");
		System.out.println(cal.get(java.util.Calendar.DATE)+"일");
		int day=cal.get(java.util.Calendar.DAY_OF_WEEK);
		
		switch(day) {
		case java.util.Calendar.SUNDAY:
			System.out.println("일요일");
			break;
		case java.util.Calendar.MONDAY:
			System.out.println("월요일");
			break;	
		}
		
		System.out.println(cal.get(java.util.Calendar.AM_PM));
		System.out.println(cal.get(java.util.Calendar.HOUR)+"시");
		System.out.println(cal.get(java.util.Calendar.MINUTE)+"분");
		System.out.println(cal.get(java.util.Calendar.SECOND)+"초");
		
		
	}

}
