package com.bit.day04;

public class Ex02 {
	//클래스 변수
	public static int su1=1111;
	//멤버필드, 인스턴스변수
	public int su2=2222;
	
	public int su3;//선언만 하고 초기화는 안했기 때문에 쓰레기값이 나옴
	
	public void func01() {
		System.out.println(su1); //Ex02.su1인데 Ex02가 생략된 것
		System.out.println(su2);
	}
	
	public static void main(String[] args) {
		//클래스의 구성요소
		//1. 메서드
		//2. 변수
		Ex02 me = new Ex02();
		
		me.func01();
		
		System.out.println("-----------------------");
		
		System.out.println(su1);
		System.out.println(me.su2);
		System.out.println(me.su3); //디폴트값나옴
		
		
		
		
	}


}
