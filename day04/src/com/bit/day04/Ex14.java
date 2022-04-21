package com.bit.day04;

public class Ex14 {

	public static void main(String[] args) {
		//배열 표현방식 1
		//int[] arr=new int[5];
		//배열 표현방식 2
		//int[] arr=new int[] {2,4,6,8,10};
		//배열 표현방식 3
		int[] arr= {2,4,6,8,10};
		/*
		2,4,6,8,10이 어떤 타입의 배열인지 모르기 때문에 안됨!
		즉
		int[] arr;
		arr={2,4,6,8,10};
		=> 안됨 => int배열인지 char 배열인지 모르기때문!
		int[] arr;
		arr=new int[]{2,4,6,8,10};
		=> 됨
		*/
		
		/*
		for(int i=0; i<5; i++) {
			arr[i]=2*(i+1);
		}
		*/
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

	}

}
