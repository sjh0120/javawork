package com.bit.day07;

public class Ex03 {

	public static void main(String[] args) {
		double su1=3.14;
		Double su2=new Double("3.14");
		Double su3=new Double(3.14);
		
		double su4=Double.parseDouble("3.14");
		
		double su5=1.0;
		double su6=0.0;
		System.out.println(su5/su6);
		System.out.println(Double.isInfinite(su5/su6));
		System.out.println((su5/su6)/0.0);
		// 무한*무한 = NaN // 0*0 = NaN // 무한*0 = NaN
		// 무한/무한 = NaN // 0/0 = NaN // 무한/0 = 무한
		
		System.out.println(su4);

	}

}
