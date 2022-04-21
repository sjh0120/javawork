package com.bit.day13;

public class Ex04 {
	//public final 지정을 통해 어짜피 안쓰면 null이니 초기화 못하도록 지정!
	
	public final static Runnable obj=new Runnable() {
		
	/*
	어나니머스 클래스 -> 클래스 명을 지정하지 않고 하나의 객체만 생성(객체의 종류를 1개로)해서 사용하겠다!
	따라서 static Runnable obj를 public final선언해도됨!
	 */
	
	//static Runnable obj=new Runnable() {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	};
	
	public static void main(String[] args) {
		
		//또한 obj를 static을 통한 위로 뽑아내서 작성 또한 가능하다!
		//위에 obj를 static으로 선언하면 밑의 Runnalbe obj쪽은 생략해도 됨
		Runnable obj=new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		
		//따라서 obj의 타입은 run메서드를 가지고 있는 Runnable 인터페이스로 선언되었기 때문에
		//obj의 타입 또한 Runnable 타입으로 선언!
		
		Thread thr=new Thread(obj);
		thr.start();
		Thread thr4=new Thread(obj);
		thr4.start();
		//또한 new Thread(); 괄호 안에 obj객체가 들어감
		//따라서 어나니머스 클래스를 객체로 선언하면 객체명을 따로 지정하지 않아도
		//재사용이 얼마든 가능하다
		//+ 어나니머스 클래스는 재사용이 얼마든지 가능하다
		
		Thread thr2=new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		thr2.start();
		
		//자체가 쓰레드 이기 떄문에 Runnable 인터페이스 없이 바로 작동 가능
		
		
		Thread thr3=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		});
		thr3.start();
		//굳이 한번을 위해서 상속 및 작동을 시킨다? => 비효율적
		//따라서 인터페이스 상속을 통한 어나니머스 클래스를 통해 작성
		//위의 단계로	
	}
	
}
