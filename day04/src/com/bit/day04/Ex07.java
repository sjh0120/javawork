package com.bit.day04;

public class Ex07 {
	public int speed;
	public String name;

	public void speedUp() {
		speed+=10;
		System.out.println(name + "현재 속도는 " + speed + "km");
	}
	
	public void speedDown() {
		speed-=10;
		System.out.println(name + "현재 속도는 " + speed + "km");
	}
	
	public static void main(String[] args) {
		/*
		System.out.println("현재 속도는 " + speed + "km");	
		speedUp();
		speedUp();
		speedUp();
		speedUp();
		speedUp();
		speedDown();
		speedDown();
		speedDown();
		speedDown();
		speedDown();
		*/
		
		Ex07 myCar1=new Ex07();
		Ex07 myCar2=new Ex07();
		
		myCar1.name = "첫차";
		myCar2.name = "세컨차";
		System.out.println(myCar1.name + " 현재 속도는 " + myCar1.speed + "km");
		myCar1.speedUp();
		myCar1.speedUp();
		myCar2.speedUp();
		myCar1.speedUp();
		myCar1.speedUp();
		myCar2.speedDown();
		myCar1.speedDown();
		myCar1.speedDown();
		myCar1.speedDown();
		myCar1.speedDown();
		
		
	
		
		
		
		
	}

}
