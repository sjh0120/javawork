package com.bit.day14;

/*
//notify -> waiting 상태에 빠져있는 요소 중 1개를 runnable상태로 빠뜨림
//notifyAll -> waiting 상태에 빠져있는 모든 요소들을 runnable 상태로 빠뜨림
// => waiting 에 아무것도 없게 만듬!
 */

class Lec07 extends Thread{
	
	public synchronized void func() {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {
		func();
		System.out.println("스레드 종료");
	}
}


public class Ex07 {

	public static void main(String[] args) {
		Lec07 target=new Lec07();
		target.start();
		Lec07 target2=new Lec07();
		target2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (target2) {//target1, target2 둘다 가능
			target2.notify();
		}
	}

}

/*
//runnable 상태에서 빠져 버린다
join -> block으로 빼버린다
synchronized -> 우선순위를 통해 스케줄러는 돌아서 온다. 하지만 다른 스레드에서 아무 작업도 안한다
yield -> 양보

make와 notify는 스레드 제어이긴 하나, Object하위 이기 떄문에 synchronized를 수반함
make, notify 에러는 -> illegarMonitorStateException 에러가 남

 */








