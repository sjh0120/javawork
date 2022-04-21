package com.bit.day04;

import java.util.Scanner;

public class ArrSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr1 = new int[2][2];
		int[][] arr2 = new int[2][2];
		
		arr1[0][0] = sc.nextInt();
		arr1[0][1] = sc.nextInt();
		
		arr1[1][0] = sc.nextInt();
		arr1[1][1] = sc.nextInt();
		
		arr2[0][0] = sc.nextInt();
		arr2[0][1] = sc.nextInt();
		
		arr2[1][0] = sc.nextInt();
		arr2[1][1] = sc.nextInt();
		sc.close();
		

		int[][] answer = new int[2][2];
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
				System.out.println("answer[" + i +"][" + j + "]=" +answer[i][j]);
			}
		}
		 

	}

}
