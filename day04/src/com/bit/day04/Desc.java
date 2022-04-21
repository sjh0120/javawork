package com.bit.day04;

import java.util.Scanner;
import java.util.Arrays;
/*
import java.util.Collections;
import java.util.ArrayList;
*/

public class Desc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		
		int[] arr = new int[String.valueOf(n).length()];
		int count=0;
		while(n>=10) {
			int num = (int)(n%10);
			arr[count] = num;
			n/=10;
			count++;
		}
		if(n<10) {
			arr[count]=(int)n;
			count++;
		}
		Arrays.sort(arr);
		for(int i = 0; i<count; i++) {
			System.out.println(arr[arr.length-1-i]);
		}
		
		
		/*
		ArrayList<Integer> list = new ArrayList<>(); 
		while(n>=10) {
			int num = (int)(n%10);
			list.add(num);
			n/=10;
		}
		list.add((int)n);
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(list.size()-i-1));
		}
		*/

	}

}
