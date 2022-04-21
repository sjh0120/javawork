package com.bit.day06;

class Lec06{
	public int su1=1111;
	
	public Lec06(int a) {
		
	}
	public void func01() {
		System.out.println("부모클래스의 기능");
	}
}

public class Ex06 extends Lec06{
	public int su1=2222;
	
	public Ex06() {
		this(1111);
		System.out.println(this.su1);//자식클래스의 su1
		//System.out.println(this.su1); => 위의 su1 앞에 this가 생략되어져 있는것!
		//ㄴ>만약 Ex06자식클래스의 su1이 명시되어져 있지 않다면 this.su1은 문법상 잘못되었지만 돌아가는 것!
		//ㄴㄴ> 구분을 잘하는 것이 매우 중요!
		System.out.println(super.su1);//부모클래스의 su1
	}
	//ㄴ> Lec06클래스의 생성자가 항상 디폴트 생성자를 통해서 생성했음
	// 그러나 Lec06(int a)를 통해 매개변수를 통한 생성자를 만들었기 때문에
	// Ex06 객체 생성에 있어 에러가 발생(부모클래스 Lec06을 생성하지 못하기 때문에)
	// 따라서 Ex06 객체 생성에 있어 디폴트 생성자에 super를 넣어서 처리를 해줘야만 함!

	//+그렇다면 생성자가 여러개 있다면?
	public Ex06(int a) {
		this(a, 0);
	}
	
	public Ex06(int a, int b) {
		super(a);
		//this() 와 super()는 공존할 수 없음!
		//다양한 생성자에서 super()가 각각 있는것은 문제가 되지 않음
		//하지만 생성자 중 1개 이상은 무조건 this()가 없어야함!
		//따라서 this()가 없는 곳에 super()를 넣는것이 일반적임
	}
	
	public static void main(String[] args) {
		Ex06 me=new Ex06();
		me.func01();

	}
	
	@Override
	//오버라이드가 맞는지 컴파일과정에서 확인해줌
	//func01이 아닌 func02라면 위에 func02가 없기 때문에 오버라이드가 아니며
	//에러가 발생하게 된다
	//오버라이드 할땐 컨트롤 + 스페이스바
	public void func01() {
		super.func01();
		//부모클래스의 기능에 자식클래스의 기능을 더 추가하는 의미!
		System.out.println("자식 재정의");
	}
	
}
