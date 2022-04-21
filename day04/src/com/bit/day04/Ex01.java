package com.bit.day04;

public class Ex01 {

	public static void main(String[] args) {
		com.bit.day04.Ex01.func01();
		Ex01 me = new Ex01();
		me.func02();

	}
	
	public static void func01() {
		System.out.println("static method");
	}
	
	public void func02() {
		System.out.println("non-static method");
	}
	

}
