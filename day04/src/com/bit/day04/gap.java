package com.bit.day04;

import java.util.Scanner;

public class gap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		sc.close();
		
		long[] answer = new long[n];
		for(int i=0; i<n; i++) {
			answer[i]=x + (x*i);
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]);
		}
		

	}

}
