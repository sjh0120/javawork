package com.bit.day14;

class Lec03 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + ":" + i);
		}
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Thread thr0=Thread.currentThread();
		System.out.println("main start...");
		Lec03 thr1 = new Lec03();
//		Lec03 thr2 = new Lec03();
		Thread thr3 = new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//System.out.println("Excption 발생...");
				//thr0.interrupt();
				//thr1에다가 interrupt를 걸면 0.1초를 안쉬게됨
				//따라서 누구한테 join을 걸고 누구한테 interrupt를 걸어야 하는지
				//잘 알아야만 한다!
			}
		};
		thr1.start();
//		thr2.start();
		thr3.start();
		try {
			thr1.join();
//			thr2.join();
			//thr2.join(1000); -> 위의 run 반복횟수를 기하급수적으로 늘려서
			//getName()을 하는 시간이 1초 이상 걸릴 때
			//join(1000); -> 1초간만 조인!
			//즉 1초가 넘어가게 되면 main end가 먼저 출력된다!
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//그렇다면 join()은 멈출 수 없는가? -> InterruptedException을 걸면 catch문으로 빠지게 된다!
		
		
		
		System.out.println("main end...");
		/*
		 * 메인스레드가 먼저 끝나고 다른 스레드가 실행되며 종료된다 즉, 메인스레드가 종료되면 프로그램이 끝난다? => x 다른 나머지 스레드까지
		 * 종료되어야만 프로그램이 끝난다!
		 */
		
		/*
		 * join을 하는 순간 join한 스레드가 끝날 때 까지
		 * main 스레드가 종료되지 않는다!
		 * join을 한 스레드가 끝나자말자 바로 main이 끝나는 것은 아님!
		 * 지체현상이 많고 노는시간이 많다!
		 */
	}

}
