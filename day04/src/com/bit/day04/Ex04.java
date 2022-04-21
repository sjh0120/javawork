package com.bit.day04;

public class Ex04 {
	public static int su=1111;

	public static void main(String[] args) {
		int su=2222;
		System.out.println("su="+su);
		//지역과 전역이 동시에 있을 때는 지역이 더 우선순위가 높음
		//변수명이 su로 같더라도 메모리 주소가 다르기 때문에 괜찮음.
		
		System.out.println("Ex.04.su="+Ex04.su);
		//지역과 전역의 변수명이 같을 때 전역변수 사용방법
		
		
	}

}
