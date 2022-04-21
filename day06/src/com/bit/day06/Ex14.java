package com.bit.day06;

//

interface Inter01{
	public final static int su1=1111;
	final static int su2=2222;
	static int su3=3333;
	int su4=4444;//단순 int su4 같지만 final static이 생략된 형태!
	
	public abstract void func01();
	public void func02();
	void func03();
}

interface Inter02 extends Inter01, Inter03{}//인터페이스 끼리는 다중으로 extends가 가능하다
interface Inter03{}

public class Ex14 extends Object implements Inter01, Inter02 {
	
	public static void main(String[] args) {
		System.out.println(Inter01.su4);
		//static으로 선언되어 있지 않아도 가능하다.
		//Object me1=new Ex14();
		Inter01 me2=new Ex14();
		me2.func01();
	}
	
	@Override
	public void func01() {
		

	}
	@Override
	public void func02() {
		

	}
	
	@Override
	public void func03() {
		
		
	}
	

}
