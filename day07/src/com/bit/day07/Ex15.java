package com.bit.day07;

//2. non-static 클래스, 인스턴스 클래스
class Outter15{
	static int su1=1111;
	int su2=2222;
	
	class Inner15 {
		//static int su3=3333;
		//ㄴ>non-static 클래스의 내부클래스라서 static 선언 불가!
		//ㄴ>static int가 가능한경우!(예외경우) => '상수'인경우!
		static final int su3=3333; // => 가능한 경우!
		int su4=4444;
		
		Inner15(){
		}
		
		//static void func03() {}
		//ㄴ>마찬가지로 non-static 클래스의 내부클래스라서 static 선언 불가!
		void func04(){
			System.out.println(su1);
			System.out.println(su2);
			//ㄴ>Outter15클래스의 Inner15클래스 내부클래스라는 점에서 outt라는 객체를 이미 찍었다는 소리
			//ㄴㄴ>따라서 그냥 su2만 해도 됨
			//=> Inner15의 func04 호출하는 거 자체로 Outter15객체와 Inner15객체가 다 찍음.
			//==> Outter15객체가 이미 찍혔기 때문에 su2는 바로 호출 가능
			//===> outt객체를 찍게되면 객체를 반복해서 찍어내는 행위!
			System.out.println(su4);
		}
	}
	
	public Outter15() {
		
	}
	
	public static void func01() {
		//Inner15 inn=new Inner15();=> 안됨
		//ㄴ> Inner15클래스 자체가 non-static이기 때문에 존재하지 않음
		//ㄴㄴ>Outter15객체 자체를 찍어야 Inner15클래스 객체가 생김!
		//System.out.println(inn.su4);
		
		Outter15 outt=new Outter15();
		System.out.println(outt.su2);
		Inner15 inn=outt.new Inner15();//=>outt라는 객체 안에 Inner15객체인 inn을 찍어낸다!
		System.out.println(inn.su4);
		System.out.println(Inner15.su3);//=>su3가 상수인경우! 예외경우!
		
			
	}
	public void func02() {
		System.out.println(su2);
		Inner15 inn=new Inner15();
		System.out.println(inn.su4);
		//=> non-static으로 Outter15객체가 선언되어서 생성되어져 있기 때문에
		//ㄴ> Outter15객체인 outt 객체 생성없이 
		//ㄴ> Outter15의 내부클래스 Inner15의 객체인 inn을 바로 생성가능
		//non-static끼리는 바로 호출이 가능하기 때문에 가능
		System.out.println(Inner15.su3);//=>su3가 상수인경우! 예외경우!
		
	}
}
public class Ex15 {

	public static void main(String[] args) {
		Outter15 outt=new Outter15();
		Outter15.Inner15 inn=outt.new Inner15();
		System.out.println(inn.su4);
		System.out.println(Outter15.Inner15.su3);//=>su3가 상수인경우! 예외경우!
		
	}
}
