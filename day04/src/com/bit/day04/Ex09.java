package com.bit.day04;

public class Ex09 {
	public int su=1111;
	
	//생성자 코드 -> me = new Ex09();
	//객체 생성시점에 하고자 하는 일을 작성
	//						ㄴ>	대표적으로 '멤버필드의 초기화'
	//한 객체에서 생성자의 호출은 객체 생성시점에 단 한번 이루어짐
	//default 생성자 -> public 클래스명(){} => 클래스의 이름이 생성자이다!
	//default 생성자는 다른 생성자가 존재하지 않을 시 생략가능 => 다른 생성자가 존재한다! => 오버로드를 통한 생성이 가능!
	public Ex09() {
		//생성자 코드에서 특별한 작업을 하고싶으면 여기에 추가하면 됨
		System.out.println("객체생성");
		int su=1111;
		su++;
		System.out.println("2.su : " + su);
	}//-> default 생성자
	public Ex09(int a) {
		System.out.println("매개변수 값으로 " + a + "값을 받는 생성자 호출");
		su +=2;
		System.out.println("3.su: " + su);
	}
	
	/*
	public Ex09(int a){} 만 존재하고 default 생성자 선언이 없다면,
	Ex09 me = new Ex09(); 는 에러 발생!
	디폴트 생성자 제외 다른 생성자는 존재하나, 디폴트 생성자는 별다른 선언이 없다면,
	디폴트 생성자를 통한 변수 선언은 불가능하다!	 
	 */

	public static void main(String[] args) {
		//클래스 기본 구성요소
		//1.메서드 - 객체기능
		//2.변수 - 객체속성, 멤버필드
		//3.생성자
		Ex09 me;			//변수의 선언(자료형 변수명;)
		me=new Ex09();		//변수의 초기화
		//me=new Ex09(1234); => 즉 생성자의 갯수는 여러개 일 수 있다!
		System.out.println("1.me.su : " + me.su);
		
		Ex09 me2;
		me2=new Ex09(1234);

		int a;
		a= 16;
		System.out.println("10진수 : "+a);
		a= 020;
		System.out.println("8진수 : "+a);
		a= 0x10;
		System.out.println("16진수 : "+a);
		a= 0020;
		System.out.println("4진수 : "+a);
		
		
	}

}
