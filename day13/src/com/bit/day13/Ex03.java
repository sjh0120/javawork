package com.bit.day13;

class Lec03 implements Runnable{
	@Override
	public void run() {
		Thread thr3=Thread.currentThread();
		System.out.println(thr3.getName());
		//System.out.println(this.getName());
		//-> Ex03 obj=new Ex03과 같은 객체 선언을 안했으므로
		//자체가 쓰레드는 아니라는 말
		//따라서 this.getName()이 안됨!
		//또한 implements라서 안됨
	}
}

public class Ex03 implements Runnable{

	public static void main(String[] args) {
		Ex03 obj=new Ex03();
		Thread thr2=new Thread(obj);
		Thread thr3=new Thread(obj);
		//obj인 Lec03이 extends Thread를 통해
		//run을 오버라이드 하면 됨
		//하지만 상속을 안한채로 run을 작동시킬 것이기 때문에
		//선언만 있는 인터페이스를 상속하면됨
		//implements Runnable을 통해 run을 오버라이드하면됨
		
		//또한 마찬가지로
		//Ex03 implements Runnable을 넣어서 Ex03 obj=new Ex03();으로
		//Thread thr2=new Thread(obj);를 해도됨!
		thr2.start();
		thr3.start();
		
		Thread thr1=Thread.currentThread();
		System.out.println(thr1.getName());
	}
	
	@Override
	public void run() {
		Thread thr3=Thread.currentThread();
		System.out.println(thr3.getName());
	}
	
	/*
	쓰레드를 만드는 방법
	1. extends Thread - run()오버라이드
	2. implements Runnable - run()오버라이드
	
	 */

}
