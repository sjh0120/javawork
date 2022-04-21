package com.bit.day06;

class Lec05{
	
	public void func01() {
		System.out.println("부모클래스의 기능");
		
	}
}

public class Ex05 extends Lec05 {

	public static void main(String[] args) {
		Lec05 you1=new Lec05();
		you1.func01();
		//you1은 Lec05 타입이기 때문에 부모클래스의 func01이 작동
		System.out.println("-----------------");
		Ex05 me=new Ex05();
		me.func01();
		//me는 Ex05 타입이기 때문에 부모클래스에 func01이 있더라도 자식의 func01이 실행됨
		me.func02();
		System.out.println("-----------------");
		Lec05 you2=new Ex05();
		you2.func01();
		//you2.func02(); => 불가능 you2의 타입이 Lec05로 선언(부모로 선언)
		//따라서 부모클래스에 func02가 없기떄문에 안됨
		//ㄴ> 다형성!
		//++you2는 Lec05타입으로 선언 되어있지만 Ex05의 객체로 생성되기 때문에
		//부모클래스의 func01이 아닌 자식클래스의 func01이 실행하게됨
		//ㄴㄴ> 하나의 객체 Ex05 형태인 you2는 다형성이 적응되어 Lec05로 선언이 가능하다
		//(즉 Ex05 객체는 Ex05 타입으로만 선언이 가능한 것이 아니라 다양한 타입 Lec05와 같은 타입으로도 선언이 가능하다.)
		//ㄴ=> 다형성!
		
		Ex05 me2=(Ex05)you2;
		// => you2를 Ex05형태로 형변환해서 me2로 선언
		me2.func02();
		// => 따라서 you2를 가진 me2에서 가능하게됨!
		
		
		

	}
	
	public void func01() {
		System.out.println("자식이 재정의를 통해 기능변환...");
	}
	
	public void func02() {
		System.out.println("자식이 추가 정의한 기능2...");
	}

}
