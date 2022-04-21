package com.bit.day05;

public class Ex02 {
	
	public static void main(String[] args) {
		int su1;
		su1=1+2; 
		//=> su1의 주소에 값을 올릴때 1+2로 따로 올리는 것이 아니라 계산이 완료된 3으로 값을 올린다
		int su2=1;
		int su3=su2+2;

		String st1="java";
		String st2=new String("java");
		String st3=null;
		String st4="";//=> String st4=new String(); 과 같음
		String st5="java";
		String st6="ja"+"va";
		
		System.out.println(st1==st2);//주소가 다르기 때문에 false
		System.out.println(st1==st5);//문자열값이 같기때문에 true
		System.out.println(st1==st6);
		//st6가 ja와 va의 조합을 통해서 이루어진 문자열이라 다른 것 같지만 같음
		//System.out.println(st4);

	}

}
