package com.bit.day04;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int count = 0;
		while(n > 1) {
			if(n%2 == 0) {
				n/=2;
			}else {
				n = n*3+1;
			}
			count++;
			if(count > 500) {
				count = -1;
				break;
			}
		}
		sc.close();
		
		System.out.println(count);		
	}
}
