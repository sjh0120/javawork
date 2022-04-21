package com.bit.day06;

abstract class Lec12{ //추상클래스 : 추상메서드를 0개 이상 갖는 클래스
	int su=1111;
	Lec12(){}
	void func01() {
		System.out.println("부모에서 구현한 기능1");
	}
	abstract void func02(); //추상메서드 : 메서드 선언만 갖음
	//ㄴ> 추상메서드를 갖기 위해서는 클래스 또한 추상클래스이어야만 한다!
	abstract void func03();
}

public class Ex12 extends Lec12 {

	public static void main(String[] args) {
		//Lec13 you=new Lec13(); // => 추상클래스는 객체가 생성될 수 없다!
		//you.func02();가 실행되면 실행될 것이 하나도 없기 때문이다! => 메서드 선언만 하고 구현부분이 없기 때문에 낭비
		
		//추상클래스 사용 목적 => 상속!
		//extends Lec13을 작성해서
		//1. Ex12를 추상클래스로
		// => public abstract class Ex12 extends Lec13 {
		//2. Ex12를 그냥 냅두고 추상메서드로 선언된 func02()를 오버라이드 하면됨
	
		Lec12 me=new Ex12();
		me.func01();
		me.func02();
		me.func03();//Ex12객체를 Lec12 타입으로 선언하였기 때문에 func03은 안됨
		//ㄴ>abstract void func03();을 Lec12에서 선언하면 작동됨!
	
	}

	@Override
	void func02() {
		System.out.println("자식에서 부여한 기능2");
		
	}
	void func03() {
		System.out.println("자식만 갖는 기능3");
	}

}
