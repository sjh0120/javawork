package com.bit.day06;

class Lec10{
	void func01() {}
	
}

public class Ex10 extends Lec10 {

	public static void main(String[] args) {
		Ex10 me=new Ex10();
		me.func01();
		
	}

	@Override
	public void func01() {
		super.func01();
	}
	//오버라이드를 할때 열리는 방향으로는 가능
	//하지만 닫히는 방향으로는 안됨!
	//ex) 부모클래스에서 private 자식클래스에서 디폴트 or public 가능!
	//    부모클래스에서ㄴㄴ 디폴트 자식클래스에서 private 불가!
	// -> 메서드 오버라이드에서는 접근제한자가 같거나 보다 공개되는 방향으로 가능하다!
	
}
