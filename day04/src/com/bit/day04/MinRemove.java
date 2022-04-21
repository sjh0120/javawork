package com.bit.day04;

import java.util.Scanner;

public class MinRemove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하시오.");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int minidx=0;
		
		if(arr.length == 1) {
			int[] answer = new int[1];
			answer[0] = -1;
			System.out.println(answer[0]);
		}else {
			int[] answer = new int[arr.length-1];
			for(int i=0; i<arr.length; i++) {
				if(arr[minidx] > arr[i]) {
					minidx=i;
				}
			}
			int count=0;
			for(int i = 0; i < arr.length; i++) {
				if(i == minidx) {continue;}
				else {
					answer[count++] = arr[i];
				}
			}
			
			for(int i=0; i<arr.length-1;i++) {
				if(i == arr.length-2) {
					System.out.print(answer[i]);
				}else {
					System.out.print(answer[i] + ", ");	
				}
			}
		}
		
	}
}
