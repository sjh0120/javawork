package com.bit.day07;

public class Ex02 {

	public static void main(String[] args) {
		byte su1=127;
		//Byte su2=new Byte(su1); //->127은 인트형이라 추론이 안됨
		Byte su2=new Byte(su1);
		Byte su3=new Byte("127"); //->String형 가능
		
		System.out.println(su3);
		System.out.println(su2==su3);// 둘다 바이트이지만 서로 다른 객체이므로 주소값이 달라서 false
		System.out.println(su2.equals(su3));
		
		long su4=4444;
		Long su5=new Long(su4);
		Long su6=new Long(4444);
		Long su7=new Long(4444L);
		Long su8=new Long("8888");
		Long su9=new Long("8888L");
		System.out.println(su9);//"L"문자가 들어갔기 때문에 에러가 발생
		
		
		
		
		
		

	}

}
