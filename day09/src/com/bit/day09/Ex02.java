package com.bit.day09;

public class Ex02 {

	public static void main(String[] args) {
		BitArray arr=new BitArray();
		arr.add("test1");
		arr.add(2222);
		arr.add("test3");
		arr.add(4.14);
		arr.add(true);
		//arr.arr[2]=9999; -> 직접 접근을 캡슐화를 통해서 막아야함!
		//System.out.println(Arrays.toString(arr.arr));
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}

}
