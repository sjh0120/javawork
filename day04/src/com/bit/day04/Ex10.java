package com.bit.day04;

public class Ex10 {
	public static final int su1=1111;
	//public static final int su1; -> 변수 초기화를 0으로 해버림
	//+ static 이지만 final로 값이 고정됨 따라서 0으로 변하지 않는 고정값
	//-> 즉 쓰레기값
	//하지만
	//public static final int su1=1111;
	//이런식으로 초기화 값을 넣어버리면 문제가 없음
	
	public final int su2;
	
	/*
	단순
	public final int su2;
	만 쓴다면 에러가 발생됨
	하지만 객체 생성 public Ex10(){}을 할 때 값을 부여하면
	에러가 발생하지 않음!	
	*/
	
	public Ex10() {
		su2=2222;
		func01();
	}
	//그렇다면 final 값은 절대 바꿀수 없는가?
	// => 놉
	public Ex10(int a) {
		su2=a;
	}
	
	public void func01() {}
	
	public static void main(String[] args) {
		//상수형 변수 ex)true
		final int ABCD;
		ABCD=2;
		//a=3; final이 아닌 그냥 int였으면 3으로 처리되나, final이 붙어서 a=3에서 에러발생
		System.out.println(ABCD);//따라서 상수형 변수는 대문자로 네이밍을 한다!
		Ex10 me1=new Ex10();
		System.out.println(me1.su2);
		//me1.su2++; => 불가능
		Ex10 me2=new Ex10(3333);
		System.out.println(me2.su2);
		//me2.su2++; => 불가능
		//객체 생성 이후 final의 값을 바꾸는 것은 불가능 하지만,
		//객체 생성할 때 final의 값을 바꿔서 서로 다른 final 값을 갖게 할 순 있다!
		
		

	}

}
