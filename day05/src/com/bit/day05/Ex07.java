package com.bit.day05;

public class Ex07 {

	public static void main(String[] args) {
		String msg1="java";
		String msg2="javascript";
		//String msg3="javc";
		//String msg4="jbvaaaaaa";
		//String msg5="JAVA";
		String msg3="ABCDE";
			
		System.out.println(msg1.compareTo(msg2));
		//얼마나 다른지 출력해줌 -> 길이가 얼마나 다른지 출력
		//System.out.println(msg1.compareTo(msg3));
		//얼마나 다른지 출력 -> a와c의 차이만큼 출력
		//System.out.println(msg1.compareTo(msg4));
		//얼마나 다른지 출력 -> 달라지는 부분에서 차이만큼 출력
		//System.out.println(msg1.compareToIgnoreCase(msg5));
		
		char[] arr1=new char[5];
		//char[] arr2=new char[3];
		//char[] arr3= {'a', 'b', 'c', 'd', 'e'};
		
		msg3.getChars(0, 5, arr1, 0);
		//msg3.getChars(1, 4, arr2, 0);
		//msg3.getChars(1, 4, arr3, 1);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("-------------------");
		//for(int i=0; i<arr2.length; i++) {
		//	System.out.println(arr2[i]);
		//}
		//System.out.println("-------------------");
		//for(int i=0; i<arr3.length; i++) {
		//	System.out.println(arr3[i]);
		//}
		//System.out.println("-------------------");
		
		String msg4="java,db,web,spring";
		
		String[] arr2=msg4.split(",");
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
