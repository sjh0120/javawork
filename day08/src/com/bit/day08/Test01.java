package com.bit.day08;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int[] lotto=new int[7];
		
		for(int i=0; i<lotto.length; i++) {
			int ran=(int)(Math.random()*45)+1;
				lotto[i]=ran;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) i--;
			}
		}
		System.out.println(Arrays.toString(lotto));
		
		System.out.println("정렬 후");
		
		for(int i=0; i<6; i++) {
			for(int j=i+1; j<6; j++) {
				if(lotto[i] > lotto[j]) {
					int temp=lotto[j];
					lotto[j]=lotto[i];
					lotto[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));

	}

}
