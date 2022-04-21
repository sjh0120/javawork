package com.bit.day14;

class Lec04 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			
			/*
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			sleep을 하게되면 그시간동안의 시간이 소비되게 되며,
//			컴퓨터는 남는시간동안 하는거 없이 놀게된다
			*/
			//따라서
			if(getName().equals("Thread-0") && i>0) {
				
				yield(); // 스레드 양보
			}else {
				//sleep()이 없다면 무규칙적으로 아무렇게나 찍힘
				//그러나 sleep()이 있으면 2개당 1개의 세트로 교차하면서 증가하게됨
				System.out.println(getName() + ":" +i);
			}
		}
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Lec04 thr1=new Lec04();
		Lec04 thr2=new Lec04();
		thr1.start();
		thr2.start();
		
	}

}
