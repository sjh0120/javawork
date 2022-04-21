package com.bit.day06;

class Lec09{
	//디자인 패턴 싱글톤패턴에 사용한다!
	private static Lec09 obj=new Lec09();
	//전역변수, 메서드에서 외부접근은 막는 경우 사용한다.
	
	private Lec09(/*String id, String pw*/) {
		//객체생성을 외부에서 못하게 막는 경우
		//1. 클래스 내부가 모두 static -> 참조변수를 통해 객체생성이 되지 않을때
		//	=> 메모리 낭비 => class에는 private를 적용할 필요가 없다
		//2. 객체생성 제어권을 외부에 주고 싶지 않은 경우 -> 객체를 무분별하게 찍어내는 경우를 막을때
		//3. 기타
	}
	public void func01() {}
	public static Lec09 newInstance() {
		//return new Lec09("id","pw");
		return obj;
	}
	//id, pw를 통해 객체를 생성할 수 있지만, 이를 사용자에게 감추고자 할 때
	//생성된 객체만 주지, 이 객체를 어떻게 생성하는지는 비밀로 처리할 때 사용
	//obj라는 static 객체 한개만 줄때 사용
}

public class Ex09 {

	public static void main(String[] args) {
		Lec09 you=Lec09.newInstance();
		//private 생성자를 통해 만들어진 고정된obj 객체를 받아쓰는것
		//모두가 obj라는 하나의 객체만 사용 가능하다
		//obj의 선언 또한 private static으로 했기때문에 obj에 null 값 또한 못넣는다.
		//하지만
		you=null;
		//you는 null이 된다고 해도 obj는 바뀌지 않아 null이 아니다.
		Lec09 you2=Lec09.newInstance();
		System.out.println(you2!=null); //true => you2는 null이 아니다
		System.out.println(you2==you); //false you=null을 없애면 you2와 you는 같음
	
	}

}
