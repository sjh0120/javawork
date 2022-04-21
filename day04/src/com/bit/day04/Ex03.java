package com.bit.day04;

public class Ex03 {
	//전역변수
	public static int d=4444;

	public static void main(String[] args) {
		System.out.println("1.d="+d);
		//지역변수
		int a=1111;
		func01(a);
		System.out.println("a="+a);
		int b = func02();
		System.out.println("b="+b);
		System.out.println("3.d="+d);
	}
	
	public static void func01(int a) {
		System.out.println("func01 a="+a);
		System.out.println("2.d="+d);
	}
	
	public static int func02() {
		int b=2222;
		int c=3333;
		d=c;
		return b;
	}

}
