package com.bit.day07;

public class Ex06 {

	public static void main(String[] args) {
		//Number su1=new Integer(1111);
		//Number su2=new Double(3.14);
		
		int su1=5;
		int su2=2;
		
		//Number su1=new Integer(5);
		//Number su2=new Integer(2);
		
		System.out.println(su1+"+"+su2+"="+(su1+su2));
		System.out.println(su1+"-"+su2+"="+(su1-su2));
		System.out.println(su1+"x"+su2+"="+(su1*su2));
		System.out.println(su1+"%"+su2+"="+(func(su1,su2)));

	}
	
	public static Number func(int a, int b) {
		if(a%b==0)
			return a/b;
		else
			return a*1.0/b;
	}

}
