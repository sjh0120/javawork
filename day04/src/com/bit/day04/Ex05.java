package com.bit.day04;

public class Ex05 {
	public int su1=1111;
	public static int su2=1111;
	
	public static void main(String[] args) {
		Ex05 me = new Ex05();
		System.out.println("1.su1="+me.su1);
		func01();
		System.out.println("4.su1="+me.su1);
		
		System.out.println("-----------------");
		
		System.out.println("1.static su2="+su2);
		func02();
		System.out.println("4.static su2="+su2);

	}
	
	public static void func01() {
		Ex05 me = new Ex05();
		//힙 영역에서 me라는 새로운 객체를 찍어냈기 때문에  4번의 su1과 값이 달라짐	
		//즉, main의 me 와 func01의 me 객체가 서로 다르기 때문에 서로 다른 값을 접근하는 것이다
		System.out.println("2.su1="+me.su1);
		me.su1++;
		System.out.println("3.su1="+me.su1);
		
		
	}
	
	public static void func02() {
		System.out.println("2.static su2="+su2);
		su2++;
		System.out.println("3.static su2="+su2);
		
		
	}

}
