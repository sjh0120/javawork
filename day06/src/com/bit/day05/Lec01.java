package com.bit.day05;

//private class ~ => 클래스 내부에서만 접근을 허용하는 클래스...? 의미없음
//public => 모든패키지에서 접근 가능
//default => 같은패키지에서만 접근 가능
//클래스 상속제한자 => final
//final 이 붙으면 더이상 상속을 하지 않는 마지막 클래스이다!라는 의미
//메서드에 final이 붙는다면? => 마지막 메서드이다 => 오버라이드를 허용하지 않겠다!


public class Lec01 {

	public static int su1=1111;
	static int su2=2222;
	private static int su3=3333;
	protected int su4=4444;
	
	
	protected Lec01(int a) {
		System.out.println("test");
	};
	public Lec01(){};
	//public Lec01(int a){}
	
	
	public void func01() {
		System.out.println(su3);
	}

}
