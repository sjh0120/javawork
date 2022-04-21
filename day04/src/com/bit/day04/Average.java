package com.bit.day04;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 정하십시오");
		int arrSize = sc.nextInt();
		int[] arr1 = new int[arrSize];
		
		for(int i=0; i<arrSize; i++) {
			arr1[i] = sc.nextInt();
			sum += arr1[i];
		}
		sc.close();
		
		double avg = sum / arrSize;
		
		System.out.println(avg);
	}

}
