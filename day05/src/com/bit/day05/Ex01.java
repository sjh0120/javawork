package com.bit.day05;

public class Ex01 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("출력");
		}
		
		print();
		
		Car car=new Car();
		car.speedUp();
		car.showSpeed();
		car.speedUp();
		car.showSpeed();
		car.speedUp();
		car.showSpeed();
		
	}
	
	public static void print() {
		System.out.println("hello world...");
	}
	
}