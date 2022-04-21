package com.bit.day06;
//접근제한자 -> public private protected friendly
//상속제한자

//메서드 접근제한자
//public : 모두접근허용
//protected : default와 동일, 단 상속을 통한 접근은 허용
//default : 동일패키지까지만 접근허용
//private : 클래스 내부에서만 접근허용

//클래스 접근제한자
//private class ~ => 클래스 내부에서만 접근을 허용하는 클래스...? 의미없음
//public => 모든패키지에서 접근 가능
//default => 같은패키지에서만 접근 가능
//따라서 public default 2개 뿐

//생성자 접근제한자
//public default private

//상속 제한자
//클래스 상속제한자 => final
//ㄴ>final 이 붙으면 더이상 상속을 하지 않는 마지막 클래스이다!라는 의미
//메서드에 final이 붙는다면?
//ㄴ> 마지막 메서드이다 => 오버라이드를 허용하지 않겠다!
//ㄴㄴ> final
//		class  : 클래스의 상속 거부
//		method : 오버라이드의 거부
//		변수   : 상수형 변수

class Lec07{
	public static int su1=1111;
	
	static int su2=2222;//디폴트
	
	private static int su3=3333;
	//접근을 허용하지 않는 가장 닫혀있는 상태
	
	public void setSu3(int su3) {
		Lec07.su3=su3;
	}
	
	public void func01() {
		System.out.println(su3);
		//본 클래스 내부에서는 접근을 허용함
	}
	
}

public class Ex07 extends com.bit.day05.Lec01{
	
	/*
	//생성자 접근제한자
	public Ex07() {
		super();
	}*/
	Ex07(int a){
		super(a);
	}
	/*
	private Ex07(int a, int b){}
	*/
	
	public static void main(String[] args) {
		
		
		//생성자 접근제한자 예시
		//com.bit.day05.Lec01 you1=new com.bit.day05.Lec01();
		//com.bit.day05.Lec01 you2=new com.bit.day05.Lec01(1111);//디폴트
		//private는 어짜피 클래스가 다르기 때문에 안됨
		//디폴트 생성자 같은 경우 상속이 되면 생성이 허용되지만
		//다른 패키지에서 protected로 선언된 상속자가 있다면 public, 디폴트 또한 작동이 안된다.
		
		/*
		System.out.println(Lec07.su1);
		System.out.println(Lec07.su2);
		System.out.println(Lec07.su3);
		같은 패키지에 있다면 su1, su2는 정상 su3는 에러 출력
		*/

		/*다른 패키지에 있다면?
		System.out.println(com.bit.day05.Lec01.su1);
		System.out.println(com.bit.day05.Lec01.su2);
		System.out.println(com.bit.day05.Lec01.su3);
		su1은 정상 su2(디폴트 접근자) su3 에러 출력
		
		System.out.println(com.bit.day05.Lec01.su4);
		ㄴ>허용하지 않음
		but 상속을 통해서는 허용함
		*/
		
		Ex07 me=new Ex07(1234);
		
		//System.out.println(com.bit.day05.Lec01.su1);
		//System.out.println(me.su4);
		//ㄴ> protected static int su4=4444;이라면 su4만 해도 가능
		//하지만 protected int su4=4444; 이므로 객체 생성하고 불러야함
	
//		Lec07 you=new Lec07();
//		you.setSu3(4444);
//		you.func01();
		//su3는 private로 설정되어 바꾸는데 있어 힘듬
		//따라서 setSu3라는 메서드를 만들어서 su3 값을 변동하도록 할 수 있음
		
	}
}
