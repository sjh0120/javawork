package com.bit.day08;

import java.util.Arrays;

public class Ex12 {

	public static void main(String[] args) {
		// 로또 번호생성기(ver 0.1.0)
		// 4,44,23,33,12,2
		// 2,4,12,23,33,44 + 보너스번호
		///////////////////////////////
		// Arrays.sort()사용 x
		///////////////////////////////
		//1.전형적인 방법
		//2.객체지향적으로 구현
		//3.아이디어 이용
		///////////////////////////////
		
		//1~45 출력 방법1
//		int ran=-1;
//		
//		while(true) {
//			ran=(int)Math.random()*100;
//			if(ran>0 || ran<=45) break;
//		} 0~99랜던출력에서 0~45범위
		
		//1~45 출력 방법2
		//int ran=(int)(Math.random()*45)+1;
		
		int[] lotto=new int[7];
		
		for(int i=0; i<lotto.length; i++) {
			int ran=(int)(Math.random()*45)+1;
				lotto[i]=ran;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) i--;//겹칠경우 반복을 이전으로 돌림 //동일값 제거
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
