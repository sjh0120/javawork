package com.bit.day04;

import java.util.Scanner;

public class Harshad {

	public static void main(String[] args) {
		boolean tf1 = true;
		
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();		
		sc.close();
		
		/*
		int ten=x/10;
		int one=x%10;
		
		int total=ten+one;
		
		if(x%total==0) {
			tf1=true;
		}else {
			tf1=false;
		}
		*/
		
		int sum=0;
		
		while(x>=10) {
			int result = x%10;
			x/=10;
			sum += result;
		}
		
		if(x<10) {
			sum += x;
		}
		
		if(x%sum==0) {
			tf1=true;
		}else {
			tf1=false;
		}
		
		System.out.println(tf1);

	}

}
