package com.bit.day08;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		GregorianCalendar cal=new GregorianCalendar(2002,5-1,1);
		System.out.println(cal.get(GregorianCalendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println("---------------------");
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));

	}

}
