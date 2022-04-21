package com.bit.day13;

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("main start...");
		//Thread thr=Thread.currentThread();
		try {
			//thr.sleep(3000);
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end...");
		
	}

}