package com.bit.day05;

public class Ex13 {

	public static void main(String[] args) {
		int[] arr1=new int[] {1,3,5,7};
		
		func01(arr1);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}
	public static void func01(int[] arr2) {	//int[] arr2=arr1 
											//=>옅은복사
		arr2[1]=2222;
		arr2[2]=3333;
	}

}
