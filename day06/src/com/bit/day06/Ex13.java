package com.bit.day06;

abstract class Machine {
	void on() {
		System.out.println("켜다");
	}
	void off() {
		System.out.println("끄다");
	}
	abstract void work();
}

class Tv extends Machine {
	@Override
	void work() {
		System.out.println("주파수를 잡아 화면을 송출한다.");
		
	}
}

class Radio extends Machine {
	@Override
	void work() {
		System.out.println("주파수를 잡아 소리를 들려준다.");
	}
}

class Audio extends Machine {
	@Override
	void work() {
		System.out.println("음악을 들려준다.");
	}
}

public class Ex13 {

	public static void main(String[] args) {
		
		Machine obj=new Audio();
		obj.on();
		obj.work();
		obj.off();
	}

}
