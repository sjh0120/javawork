package com.bit.javatest;

import java.util.Scanner;
/*
class Student{
	String[] stuName=new String[] {};
	int[][] stuScoreList=new int[][] {};
	
	public void setName(String name) {
		String[] before=stuName;
		stuName=new String[stuName.length+1];
		stuName=before;
		stuName[stuName.length-1]=name;
	}
	
	public void stuAdd(int[] score) {
		stuScoreList[count]=score;
	}
	
	public String getName(int idx) {
		return stuName[idx];
	}
	
	public int Size() {
		int size=0;
		for(int i=0; i<30; i++) {
			if(stuName[i].isEmpty()) {
				size=i;
			}
		}
		return size;
	}
}
*/

public class JavaTest2 {

	public static void main(String[] args) {
		/*
		System.out.println("학생성적관리 프로그램");
		
		int input;
		String[] sub = new String[] {"기초문법", "백엔드", "프런트엔드"};
		Scanner sc=new Scanner(System.in);
		
		Student stuList=new Student();
		
		while(true) {
			System.out.print("1.입력 2.출력 3.수정 4.삭제 0.종료 >");
			input=Integer.parseInt(sc.nextLine());
			if(input==0) {
				System.out.println("종료합니다");
				sc.close();
				break;
			}else if(input==1) {
				String name="";
				int[] score=new int[3];
				System.out.print("학생의 이름을 입력하세요 >");
				name=sc.nextLine();
				stuList.setName(name);
				System.out.print(sub[0] + "점수 > ");
				input=Integer.parseInt(sc.nextLine());
				score[0]=input;
				System.out.print(sub[1] + "점수 > ");
				input=Integer.parseInt(sc.nextLine());
				score[1]=input;
				System.out.print(sub[2] + "점수 > ");
				input=Integer.parseInt(sc.nextLine());
				score[2]=input;
				stuList.stuAdd(score);
			}else if(input==2) {
				for(int i=0; i<stuList.Size(); i++) {
					System.out.println(stuList.getName(i));
					
				}
			}
		}
		*/
		
		
	}
}
