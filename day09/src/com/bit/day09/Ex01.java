package com.bit.day09;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("학생성적관리프로그램 (ver 0.3.0.)");
		int input=0;
		String[] msg= {"국어","영어","수학"};
		
		BitArray list=new BitArray();
		
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
				int[] stu=new int[msg.length];		
			
				for(int i=0; i<msg.length; i++) {
					func01(msg[i], i, sc, stu);
				}
				list.add(stu);
				
			}else if(input==2) {
				System.out.println("----------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("----------------------------");
				for(int i=0; i<list.size(); i++) {
					int[] stu=(int[])list.get(i);
					System.out.println(i+1+"\t" + stu[0]+"\t" + stu[1]+"\t" + stu[2]);
				}
				System.out.println("----------------------------");	
			}else if(input==3) {
				System.out.println("수정할 학번을 입력하세요");
				int num=Integer.parseInt(sc.nextLine());
				if(num<=list.size()) {
					int[] stu=new int[msg.length];
					for(int i=0; i<stu.length; i++) {
						func01(msg[i], i, sc, stu);
					}	
					list.set(num-1, stu);	
				}else System.out.println("없는 학번입니다");
							
			}else if(input==4) {
				System.out.println("삭제할 학번을 입력하세요");
				input=Integer.parseInt(sc.nextLine());
				if(input<=list.size()) {
					list.remove(input-1);
				}else System.out.println("없는 학번입니다");
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
