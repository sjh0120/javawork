package com.bit.day14;

class Lec08 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("thread working...");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex08 {

	public static void main(String[] args) {
		System.out.println("main start...");
		Lec08 thr=new Lec08();
		thr.setDaemon(true);//위의 스레드는 무한 루프라서 main이 끝나더라도 계속 실행됨
		//하지만 데몬스레드를 설정함으로서 main 스레드가 종료되면 나머지 스레드를 종료하도록 설정하는 기능!
		//데몬 스레드는 스레드를 시작하기 전에 먼저 선언해야만 한다!
		//즉 메인 스레드에 종속되어져야만 한다!라는 의미
		//메인 스레드가 return 되어 종료되기 전에 데몬스레드를 종료시킨다!
		thr.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end...");
	}

}
