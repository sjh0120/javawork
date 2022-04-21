package com.bit.day05;

public class Car {
	public int speed = 0;
	public String model;

	public void speedUp() {
		speed+=10;
	}
	
	public void speedDown() {
		speed-=15;
		
	}
	public void showSpeed() {
		System.out.println(model + " 내차의 현재속도는 " + speed + "km");
	}

}
