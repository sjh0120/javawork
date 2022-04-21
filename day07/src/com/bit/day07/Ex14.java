package com.bit.day07;

import com.bit.day07.Outter14.Inner14;

class Outter14{//아웃터클래스
	
	static int su3=3333;
	int su4=4444;
	
	//1. static 클래스(내부클래스)
	//파일 형태 -> 클래스명$내부클래스.class
	static class Inner14{
		static int su1=1111;
		int su2=2222;
		
		Inner14(){
			
		}
		
		static void func01() {
			System.out.println(su3);
			Outter14 outt=new Outter14();
			System.out.println(outt.su4);
			func03();
			outt.func04();
		}
		void func02() {
			System.out.println(su3);
			Outter14 outt=new Outter14();
			System.out.println(outt.su4);
			func03();
			outt.func04();
		}
		
	}
		
	Outter14(){}
	static void func03() {
		System.out.println(Inner14.su1);//->su1은 Inner14클래스안에 있기 때문에 Inner14클래스를 선언하고 해야한다
		System.out.println(su3);//-> System.out.println(Outter14.su1);과 같은 의미
		Inner14 inn=new Inner14();
		System.out.println(inn.su2);
		Inner14.func01();
		inn.func02();
	}
	void func04(){
		
	}
		
}

public class Ex14 {

	public static void main(String[] args) {
		System.out.println(Outter14.su3);
		Outter14 outt=new Outter14();
		System.out.println(outt.su4);
		
		//System.out.println(Inner14.su1);
		//ㄴ>Inner14클래스는 Outter클래스 안에 있기 때문에 안됨!
		
		System.out.println(Outter14.Inner14.su1);
		Outter14.Inner14 inn=new Outter14.Inner14();
		System.out.println(inn.su2);
		

	}

}
