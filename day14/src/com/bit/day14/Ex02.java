package com.bit.day14;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("main start...");
		try {
			Thread.sleep(3000); //running 상태에서 blocked상태로 3초간 빠져있다가 runnable로 빠지는 것!
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end...");
		
	}

}
