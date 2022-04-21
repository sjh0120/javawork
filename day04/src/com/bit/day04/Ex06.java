package com.bit.day04;

public class Ex06 {
	public int su=1111;
	public String msg ="";
	
	public static void main(String[] args) {
		Ex06 me1=new Ex06();//su=1111;
		me1.su++;//su=1112;
		System.out.println(me1.su);//su=1112;
		Ex06 me2=new Ex06();//su=1111;
		me2.su++;//su=1112;
		System.out.println(me2.su);//su=1112;
		me2.su++;//su=1113;
		System.out.println(me2.su);//su=1113;
		System.out.println(me1.msg);

	}

}
