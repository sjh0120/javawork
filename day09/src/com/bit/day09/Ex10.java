package com.bit.day09;

import java.util.Vector;

public class Ex10 {

	public static void main(String[] args) {
		java.util.Vector vec1=new Vector();
		vec1.addElement("첫 번째");
		vec1.addElement("두 번째");
		vec1.addElement("세 번째");
		vec1.addElement("네 번째");
		
		System.out.println(vec1.elementAt(0));
		System.out.println(vec1.elementAt(1));
		System.out.println(vec1.elementAt(2));
		System.out.println(vec1.elementAt(3));

		System.out.println("---------------------------");
		System.out.println(vec1.firstElement());
		//vec1.removeElementAt(0);
		System.out.println("----------제거후-----------");
		System.out.println(vec1.firstElement());
		System.out.println(vec1.lastElement());
		System.out.println("---------------------------");
		java.util.Enumeration enu=vec1.elements();
		
//		System.out.println(enu.hasMoreElements());
//		System.out.println(enu.nextElement());
//		System.out.println(enu.hasMoreElements());
//		System.out.println(enu.nextElement());
//		System.out.println(enu.hasMoreElements());
//		System.out.println(enu.nextElement());
//		System.out.println(enu.hasMoreElements());
//		System.out.println(enu.nextElement());
//		System.out.println(enu.hasMoreElements());

		//vector는 모든 자료구조의 특성을 표현하기 위해서 만들어진 객체
		//따라서 자료구조의 객체에서 순서가 안정해져있을 때 지시자를 통해 다음 객체가 무엇인지 표현을 하여야한다.
		
		System.out.println("-----------반복문------------");
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		enu=vec1.elements();
		System.out.println("-----------한번더------------");
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
			//한번 Enumeration을 통해서 빠져나가면 다시 부를 수가 없음!
			//따라서 새로 Enumeration을 선언해서 받아줘야함
		}

	}

}
