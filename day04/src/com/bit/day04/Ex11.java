package com.bit.day04;

public class Ex11 {
	public final int su;
	
	public Ex11() {
		this(0);//객체 생성 없음
	}
	
	public Ex11(int a){
		this(a,0);//객체 생성 없음
	}
	
	public Ex11(int a, int b){
		System.out.println("객체의 생성");
		su=a+b;
	}
	
	//원래 생성자를 통해서 매번 객체의 생성이 일어나야하지만,
	//중복된 코드를 없애기 위해서 this로 처리하고,
	//최종적으로 this가 없는 생성자 1개를 통해서만 객체를 생성한다
	//따라서 생성자들 중 최소 1개 이상은 this로 구성되어 있지 않아야한다!
	//+this는 항상 최상단에 와야만함!
	
	public static void main(String[] args) {
		//Ex11 me1=new Ex11();
		//Ex11 me2=new Ex11(1111);
		//Ex11 me3=new Ex11(1111,2222);

	}

}
