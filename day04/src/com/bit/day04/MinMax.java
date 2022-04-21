package com.bit.day04;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int min, max, minResult;
		int gcd=1;
		
		if(n>=m) {
			min = m;
			max = n;
		}else {
			min = n;
			max = m;
		}
		
		for(int i=1; i<=min; i++) {
			if(n%i==0 && m%i==0) {
				gcd=i;
			}
		}
		sc.close();
		minResult = (n*m)/gcd;					
		
		System.out.println("최대 공약수 : " + gcd);
		System.out.println("최소 공배수 : " + minResult);
		

	}

}
