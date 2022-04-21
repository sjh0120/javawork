package com.bit.day04;

import java.util.Scanner;

public class StudentScoreManage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int korean = sc.nextInt();
		int english = sc.nextInt();
		int math = sc.nextInt();
		sc.close();
		
		//int korean=84;
		//int english=93;
		//int math=70;
		int sum=korean+english+math;
		double avg=(double)sum/3;
		char grade = ' ';
		
		if(avg>=90 && avg<=100) grade = 'A';
		else if(avg<90 && avg>=80) grade = 'B';
		else if(avg<80 && avg>=70) grade = 'C';
		else if(avg<70 && avg>=60) grade = 'D';
		else if(avg<60) grade = 'F';

		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f \n", avg);
		System.out.printf("등급 : %c", grade);
			

	}

}
