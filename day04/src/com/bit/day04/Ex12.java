package com.bit.day04;

public class Ex12 {
	public int su=1111;
	
	public Ex12() {	}
	
	public Ex12(int su) {
		this.su=su;
	}

	public static void main(String[] args) {
		Ex12 me=new Ex12(3333);
		me.su++;
		System.out.println("main su=" + me.su);
		me.func01();
		me.func02(me);
		me.func03(4444);

	}
	
	public void func01() {
		Ex12 me=new Ex12();
		System.out.println("func01 su=" + me.su);
		//func01의 me와 main의 me는 서로 다른 객체!
		//따라서 su의 값이 다름
	}
	
	public void func02(Ex12 me) {
		System.out.println("func02 su=" + me.su);
		//main의 me를 받아와서 func02에서 사용하기 때문에
		//같은 객체!
		//따라서 su의 값이 같음
		System.out.println("func02 su=" + su);
		//이떄 su 앞에 생략된 값이 this!
		System.out.println("func02 su=" + this.su);
		//즉 위의 3줄은 다 같은 객체
		System.out.println(me==this);
		//(증명)reference가 같다=> 즉 같은 객체이다!
		
		int su=2222;
		System.out.println("func02 su=" + su);
		//위의 su는 전역변수의 su값이며,
		//밑의 su는 지역변수의 su값이다!
		
	}
	
	public void func03(int su) {
		this.su=su;
		System.out.println("func03 su=" + su);
	}
	
	// static -> static 		[클래스명].메서드명();
	// static -> non-static		참조변수.메서드명();
	// non-static -> static		[클래스명].메서드명();
	// non-static -> non-static	메서드명();
	

}
