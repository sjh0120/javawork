package com.bit.day05;

public class Ex04 {

	public static void main(String[] args) {
		String msg="한글";
		
		char[] arr1=msg.toCharArray();
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		byte[] arr2=msg.getBytes();
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
