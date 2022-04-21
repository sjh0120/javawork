package com.bit.day05;

public class Ex12 {

	public static void main(String[] args) {
		int[] arr1;
		arr1=new int[5];
		arr1[0]=1111;
		arr1[1]=2222;
		arr1[2]=3333;
		arr1[3]=4444;
		arr1[4]=5555;
		
		//깊은 복사
		//int[] arr2=new int[]{1111,2222,3333,4444,5555};
		/*1.깊은 복사
		int[] arr2=new int[arr1.length];
		for(int i=0; i<arr2.length; i++){
			arr2[i]=arr1[i];
		}
		*/
		/*2.깊은 복사
		int[] arr2=new int[arr1.length];
		System.arraycopy(arr1, 0, arr2, 1, 3);
		*/
		
		//얕은복사
		int[] arr2=arr1;
		
		arr2[2]=3000;
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}
