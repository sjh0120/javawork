package com.bit.day04;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n = sc.nextLong();		
		sc.close();
		
		int result=-1;
		for(int i = 1; i < n; i++) {
			if(n/i == i) {
				result = i;
				break;
			}
		}
		
		if(result != -1) {
			result = (result+1)*(result+1);
			System.out.println(result);
		}else System.out.println(result);
		
		/*
		double result;
		
		Double sqrt = Math.sqrt(n);
		
		if(sqrt == sqrt.intValue()) {
			result = (long)Math.pow(sqrt+1,2);
		}else result = -1;
		
		System.out.println(result);
		*/
	}

}
