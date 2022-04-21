package com.bit.day06;

public class Ex04 {
//=> 상속을 안받은것 처럼 보이지만
//=> public class Ex04 extends Object {
//=> 모든 클래스는 최상위 Object 클래스를 상속받고 있다!

	public static void main(String[] args) {
	
		Ex04 me=new Ex04();
		System.out.println(me.toString());
		//ㄴ> toString이 상속되어있는 클래스를 상속 받았기 때문에 실행이 가능하다!
		//ㄴㄴ> 즉 상속을 기본적으로 받아져있는 상태!
		//ㄴㄴㄴ> 자바는 단일상속 이상이 가능하다
		//ㄴㄴㄴㄴ> 별도의 상속을 지정하지 않으면 Object클래스가 상속되어져있다!
		
		
	}

}
