package com.bit.day04;
/*
학생성적 관리프로그램(ver 0.1.0)
한 학생의 성적을 통해 다음을 출력하시오
요구사항
과목은 3과목
과목별 성적은 : 국어:84, 영어:93, 수학:70
매 실행시 성적은 변경될 것임
평균은 소수점 2자리수까지만 출력

결과
-------------------------------
국어:84		영어:93		수학:70
-------------------------------
합계:000
평균:00.00
-------------------------------
학점:B학점
(100~90이상:A, 90미만~80이상:B,
80미만~70이상:C, 70미만 60이상:D, 60미만:F)
 */

public class Ex08 {

public static void main(String[] args) {
		int korean=84;
		int english=93;
		int math=70;
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
