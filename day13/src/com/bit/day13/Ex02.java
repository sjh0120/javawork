package com.bit.day13;

public class Ex02 extends Thread {

	public static void main(String[] args) {
		Ex02 me=new Ex02();
		me.start();
		
		Thread thr1=Thread.currentThread();
		System.out.println(thr1.getName());
		
		
		
	}
	
	@Override
	public void run() {
		Thread thr2=Thread.currentThread();
		System.out.println(thr2.getName());
		
		//가능
		//Thread.currentThread();라는 것이 currentThread() 메서드가static이라는 의미
		//Ex02 me 자체가 Thread를 상속 받았기 때문에
		//this를 통해서 바로 가능
		//Thread thr2=this.currentThread();
		//System.out.println(thr2.getName());
		
		//또한 가능
		//System.out.println(this.getName());
	}

}
