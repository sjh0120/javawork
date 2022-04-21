package com.bit.day13;

public class Ex06 extends Thread {
	
	public Ex06() {
		super("thread2");
	}
	
	public Ex06(String name) {
		super(name);
	}

	public static void main(String[] args) {
		Runnable work=new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		Thread thr1=new Thread(work,"thread1");
//		thr1.setName("스레드1");
		thr1.start();

		Ex06 me=new Ex06();
//		me.setName("스레드2");
		me.start();
		
		Ex06 me2=new Ex06("thread3");
		me2.start();
	}
	
	@Override
	public void run() {
		System.out.println(getName());
	}

}
