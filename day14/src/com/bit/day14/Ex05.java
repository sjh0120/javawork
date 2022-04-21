package com.bit.day14;

class Lec05 extends Thread{
	
	@Override
	public void run() {
		System.out.println(getName() + "start");
		int sum=0;
		for(int i=0; i<2000000; i++) {
			sum+=i;
		}
		System.out.println(getName() + "end...");
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Lec05 target=new Lec05();
//		target.start();
		while(true) {
			Thread.State state=target.getState();
			System.out.println(state.toString());
			if(state==state.NEW) {
				target.start();
			}
			if(state==state.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
