package com.bit.day14;

class Lec01 extends Thread{
	//이전에 배운 stop terminate를 통한 스레드의 강제종료는
	//스레드의 버퍼속 데이터 손실을 발생시킨다
	//따라서 우리는 return을 통해 데이터 손실을 방지시키고 스레드를 종료시키면 된다
	int cnt;
	
	public Lec01(String name, int cnt) {
		super(name);
		this.cnt=cnt;
	}
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			if(i==cnt) return; //코드적으로 스레드의 종료를 제어!
			System.out.println(this.getName()+":" + i);
		}
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		//스레드의 활동 빈도 확률-> 1:1:1
		//ㄴ> 단 실행했을 때 항상 그런것은 아님!
		//ㄴㄴ>스케줄러에 우선순위를 부여하면 더 많이 일할 확률을 높여줌
		//ㄴㄴㄴ>확률을 높여준다? => 스레드에서 일찍 끝날 확률이 높다
		Lec01 thr1=new Lec01("첫번째",2);
		Lec01 thr2=new Lec01("두번째",4);
		Lec01 thr3=new Lec01("세번째",6);
		/*
		thr1.setPriority(5); //스레드의 선택받을 빈도
		//default=5 // 빈도의 범위 1~10
		thr2.setPriority(1); //최저 확률
		thr3.setPriority(10); //최고 확률
		//-> 우선순위의 gap차이 => 상대적인 것일 뿐! 
		//3, 6이라고 정확히 2배차이인 것이 아니라,
		//다른 스레드에 비해서 발생활 확률이 높다 적다 라는 개념
		*/
		
		//위의 숫자로 표기를 해두면 까먹기 때문에
		thr1.setPriority(Thread.NORM_PRIORITY); // 5
		thr2.setPriority(Thread.MIN_PRIORITY);  // 1
		thr3.setPriority(Thread.MAX_PRIORITY); // 10
		//상수형 변수로 지정해둔다!
		//우리가 막 1천번 1만번 이상 시행하는 것이 아니기 때문에
		//실질적으로 우리한텐 의미가 없다
		
		
		thr1.start();
		thr2.start();
		thr3.start();
		
	}

}
