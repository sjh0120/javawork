package com.bit.day08;

public class Ex01 {

	public static void main(String[] args) {
		String st1="java";
		//String st2=new String("java");
		
		//StringBuffer st4="java"; => 안됨
		//물론 다형성을 통해서 처리는 가능함
		//ㄴ> 기존 스트링의 단점을 보완하기 위해 나옴
		//ㄴㄴ>스트링의 단점 : 항상 새로운 객체를 반환한다.
		//		ㄴ>기존 스트링의 변경에 있어서도 새로운 객체를 반환하므로 메모리 사용이 비효율적이다.
		
		//기존의 String 쓰듯 StringBuffer를 쓰면 에러가 발생함
		//ex)
		String st2=st1;
		st2=st2.concat("Edit");
//		System.out.println(st1); => java
//		System.out.println(st2); => javaEdit
		
		StringBuffer st3=new StringBuffer("java");
		//st3가 java라고 해서 4개의 공간만을 확보하는 것이 아니라
		//StringBuffer이기 때문에 Buffer라는 공간을 미리 확보해둔것!
		StringBuffer st4=st3;
		st3.append("Edit");
		
		System.out.println(st3);//=>javaEdit
		System.out.println(st4);//=>javaEdit
		
		/*
		기존의 String의 경우 concat을 통해 추가하더라도 기존의 이전객체는 변하지 않음
		하지만 StringBuffer의 경우 append를 통해 추가하면 기존의 이전객체를 조작하지 않았음에도 변경됨!
		-> StringBuffer를 다를 때에는 StringBuffer를 객체로 생각하고 다뤄야 한다!!
		 */
		
	}

}
