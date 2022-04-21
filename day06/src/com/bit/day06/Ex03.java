package com.bit.day06;

class Lec03{
	public int su1=1111;
	public void func01() {
		System.out.println("부모클래스의 기능:" +this.su1);
	}
}

public class Ex03 extends Lec03 {
	public int su1=1000;
	//ㄴ> 오버라이드는 메서드를 덮어쓰는 것만 해당됨 su1는 필드이기 때문에 오버라이드 x
	
	public static void main(String[] args) {
		Ex03 me=new Ex03();
		System.out.println(me.su1);
		me.func01();
	}
	
	//메서드 오버라이드
	//부모클래스의 메서드와 구조가 동일
	
	
	public void func01(){
	//public void func01(int a){ -> 다르기 때문에 오버라이드가 아닌 오버로드가 됨
		System.out.println("자식클래스의 기능:"+this.su1);
		//부모, 자식 클래스 둘다에 func01()이 있지만 자식클래스 부터 먼저 수행된다
	}
	

}
