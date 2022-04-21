package com.bit.day07;

//4. 익명클래스

interface Inter{
	void func();
}

class Lec17{
	Inter func01() {
		return new Inter(){//인터페이스는 객체가 될 수 없음 생성자만 선언 가능
			//따라서 이건 인터페이스 Inter를 상속받는 클래스라는 의미
			//하지만 클래스에 이름을 없이 한번만 돌아가는 클래스
			//즉 어나니머스 클래스 -> 익명 클래스
			public void func() {
				System.out.println("local run....");
			}
		};
	}
}

public class Ex17 {

	public static void main(String[] args) {
		Lec17 you=new Lec17();
		//you.func01();
		Inter obj=you.func01();
		obj.func();

	}

}
