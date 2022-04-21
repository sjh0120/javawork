package com.bit.day07;

public class Ex01 {

	public static void main(String[] args) {
		int su1=1111;
		Integer su2=new Integer(127);
		Integer su3=new Integer("3333");
		//Integer su4=new Integer("aaaa");
		//Integer su5=new Integer("55.55");
		//Integer su6=new Integer("-3333");
		Integer su4=4444; //-> 오토박싱 
		//원래는 new Integer(4444);를 해야하지만 자동으로 wrapper 클래스에 의해서 처리되어 지는 것
		int su5=su2; // -> 언박싱 //오토박싱의 반대
		Integer su6=su2+su3;
		//ㄴ> 언박싱을 통해서 2222, 3333을 꺼내와서 5555를 만든 후
		//ㄴ> int형이기 때문에 Integer형으로 박싱을 한다.
		//ㄴㄴ> 단순한 처리가 아닌 자원소비를 많이 하는 비효율적인 연산이다 => 되도록 안하는게 좋다.
		
		System.out.println(su2);
		System.out.println(su3+1);
		//System.out.println(su4); //-> 10진수 정수여야만 한다
		//System.out.println(su5); //-> 소수점 또한 안된다
		//System.out.println(su6); //-> 부호는 가능하다
		System.out.println(su4);
		System.out.println(su6);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(su2.byteValue());
		
		int su7=Integer.parseInt("7777"); //=> return 자체가 int
		System.out.println(su7);
		Integer su8=Integer.valueOf("8888"); // => return 자체가 Integer
		System.out.println(su8);
		/*
		String su8=String.valueOf(su7);
		System.out.println(su8);
		*/
		int su9=0xac00;
		System.out.println(su9);
		System.out.println(0xac00);
		
		int su10=16;
		System.out.println("2진수:" + Integer.toBinaryString(su10));
		System.out.println("2진수:" + Integer.toOctalString(su10));
		System.out.println("2진수:" + Integer.toHexString(su10));
		

	}

}
