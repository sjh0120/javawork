package com.bit.day09;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("학생성적관리프로그램 (ver 0.3.0.)");
		int input=0;
		int size=0;
		
		int[][] arr=new int[size][];
		int[][] before=null;
		
		int idx=0;
		
		while(true) {
			try {
				System.out.print("1.입력 2.보기 [3.수정 4.삭제] 0.종료>");
				input=Integer.parseInt(sc.nextLine());
			}catch(java.lang.NumberFormatException e) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			if(input==0) {
				break;
			}else if(input==1) {
				before=arr;// 이전값 저장
				size++;
				arr=new int[size][];
				int[] stu=new int[3];
				
				// 복사
//				for(int i=0; i<before.length; i++) {
//					arr[i]=before[i];
//				}
				//코드 줄이면
				System.arraycopy(before,0, arr,0, before.length);
				//ㄴ>깊은 복사
				
//				int[] stu=arr[idx++];
				String[] msg= {"국어","영어","수학"};
				for(int i=0; i<msg.length; i++) {
					func01(msg[i], i, sc, stu);
				}
				/*
				func01("국어", 0, sc, stu);
				func01("영어", 1, sc, stu);
				func01("수학", 2, sc, stu);
				 */

				arr[idx++]=stu;
			}else if(input==2) {
				System.out.println("----------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("----------------------------");
				for(int i=0; i<arr.length; i++) {
					int[] stu=arr[i];
					if(stu!=null) System.out.println(i+1+"\t"+stu[0] + "\t" + stu[1] + "\t" + stu[2]);
					else System.out.println("-");
				}
				
				System.out.println("----------------------------");
				
			}
		}
		
		System.out.println("이용해주셔서 감사합니다");

	}

	public static void func01(String msg, int i, Scanner sc, int[] stu) {
		int input=0;
		while(true) {
			System.out.print(msg+">");
			try {
				input=Integer.parseInt(sc.nextLine());
			}catch(java.lang.NumberFormatException e) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			if(input<=100) break;
			else {
				System.out.println("점수는 100점 이하입니다");
			}
		}	
		stu[i]=input;
	}
}
