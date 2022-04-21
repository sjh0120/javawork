package com.bit.day04;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if(num%2==0) {
			System.out.println("Even");
		}else if(num==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
