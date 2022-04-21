package com.bit.day13;

class Lec01 extends java.lang.Thread{
	
	@Override
	public void run() {
		Thread thr=Thread.currentThread();
		for(int i=0; i<50; i++) {
		System.out.println(thr.getName() +": " +i);
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Lec01 thr2=new Lec01();
		Lec01 thr3=new Lec01();
		thr2.start();
		thr3.start();
		//ㄴ> 쓰레드를 새로 생성해서 run까지 다 실행시키는것!
		//ㄴㄴ> 객체 생성해서 단순 메서드를 호출하는 것과는 약간 다름!
		//+ 객체에 해당하는 클래스는 쓰레드를 상속받아야한다
		//thr2와 thr3의 실행순서로 보면 thr2가 먼저있어서 thr2를 먼저 실행해야 할 것
		//같지만 스케줄러에 영향을 받아 바뀌는 것이 때문에
		//어떤게 먼저 실행될지 모름!
		//다만 확률적으로 main이 준비운동이 없기 때문에 먼저 수행될 가능성이 높다!
		
		Thread thr=Thread.currentThread();
		for(int i=0; i<50; i++) {
			System.out.println(thr.getName() + i);
		}
		
		//thr2와 thr의 순서를 바꾼 이유
		//ㄴ> 객체 thr2를 생성하고 thr2객체는 스스로 실행하도록 하고
		//밑의 main쓰레드는 메인쓰레드끼리 실행되도록 별도로 구분해둔 것
		//ㄴ> 동시에 일 시키는 것 => 엄연히 따지면 동시에 하는 것이 아니므로
		//출력결과가 매번 다르다! => 스케쥴 제어를 안했기 때문!
		
		
		//thr2.run(); //단순 객체를 생성하고 객체의 메서드를 호출하는 의미
		//ㄴ> 쓰레드를 새로 생성해서 run을 하는 것이 아님!
		
		//내가 원하는 쓰레드를 제어하기 위해서는 쓰레드의 이름을 부여하고 해야한다! 
	}
	
	
}
