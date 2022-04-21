package com.bit.day08;

//로또 번호생성기(ver 0.1.0)
// 4,44,23,33,12,2
// 2,4,12,23,33,44 + 보너스번호
///////////////////////////////
// Arrays.sort()사용 x
///////////////////////////////
//1.전형적인 방법
//2.객체지향적으로 구현
//3.아이디어 이용
///////////////////////////////

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		int[] lotto=new int[45];//->1~45까지의 숫자 전체를 두고 섞는다
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=1+i;
		}

		System.out.println(Arrays.toString(lotto));
		int temp=-1;
		for(int i=0; i<1000; i++) {
			int su=(int)(Math.random()*44)+1;
			temp=lotto[0];
			lotto[0]=lotto[su];
			lotto[su]=temp;
		}
		
		for(int i=0; i<6; i++) {
			for(int j=i+1; j<6; j++) {
				if(lotto[i] > lotto[j]) {
					int temp2=lotto[j];
					lotto[j]=lotto[i];
					lotto[i]=temp2;
				}
			}
		}
		
		for(int i=0; i<6; i++) {
			if(i!=0)System.out.print(", ");
			System.out.print(lotto[i]);
		}
		System.out.println(" 보너스 번호 : " +lotto[6]);
		
	}
}
