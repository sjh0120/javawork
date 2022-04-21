package com.bit.day04;

class Car{
	public int speed;
	public final String model;
	public String company;
	public int max;
	public String color;
	
	public Car(int max) {
		if(max<=150) {
			model="모닝";
		}else if(max <=180) {
			model="k3";
		}else if(max <=200) {
			model="k5";
		}else {
			model="몰?루";
		}
		this.max=max;
		color="흰";
	}
	
	public Car(String model, int max) {
		this.model=model;
		this.max=max;
		color="흰";
		
	}
	
	public void speedUp() {
		if(speed+10>=max) speed=max;
		else speed+=10;
		
		/*
		speed+=10;
		if(speed>max) speed=max;
		*/
		
		/*
		if(speed+10 <= max) {
			speed+=10;
		}else{
			speed=max;
			System.out.println("최대 속도인 " + max + "km입니다");
		}
		*/
	}
	
	public void speedDown() {
		if(speed-15<0) speed=0;
		else speed-=15;
		
		/*
		speed-=15;
		if(speed<0) speed=0;
		*/
		
		/*
		if(speed-15>=0) {
			speed-=15;
		}else {
			speed=0;
			System.out.println("차가 이미 정지해 있습니다. 속도" + speed + "km입니다");
		}
		*/
	}
	public void showSpeed() {
		System.out.println(color + "색 " + model + " 내차의 현재속도는 " + speed + "km");
	}
	
}

public class Ex13 {

	public static void main(String[] args) {
		Car myCar=new Car(200);
		//Car myCar=new Car("모닝", 150);
		//myCar.max=155;
		//myCar.model="모닝";
		//myCar.max=150;
		//myCar.color="빨간";
		myCar.showSpeed();
		for(int i=0; i<20; i++) {
			myCar.speedUp();
			myCar.showSpeed();
		}
		for(int i=0; i<20; i++) {
			myCar.speedDown();
			myCar.showSpeed();
		}
		
		System.out.println("---------------------------------");
		
		myCar=new Car("k3", 180);
		//myCar.model="k3";
		//myCar.max=180;
		myCar.color="검은";
		myCar.showSpeed();
		
		for(int i=0; i<20; i++) {
			myCar.speedUp();
			myCar.showSpeed();
		}
		for(int i=0; i<20; i++) {
			myCar.speedDown();
			myCar.showSpeed();
		}
		

	}

}
