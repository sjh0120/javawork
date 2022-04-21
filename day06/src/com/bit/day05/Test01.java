package com.bit.day05;


/*
0322과제
Q1. 자바의 정규표현식 조사, 예시

Q2. 학생 성적관리 프로그램(ver 0.2.0)-문자열 이용

결과
학생 성적관리 프로그램(ver 0.2.0)
---------------------------------
1. 입력 2. 결과 0. 종료>1
1학번 국어>91
1학번 영어>81
1학번 수학>71
1. 입력 2. 결과 0. 종료>1
2학번 국어>92
2학번 영어>82
2학번 수학>72
1. 입력 2. 결과 0. 종료>2
---------------------------------
학번 |국어   |영어   |수학  
1    |91     |81     |71
2    |92     |82     |72
---------------------------------
1. 입력 2. 결과 0. 종료>0
이용해주셔서 감사합니다.
*/


public class Test01 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input;
		int num=0;
		String table="학번 |국어   |영어   |수학  ";
		
		System.out.println("학생 성적관리 프로그램(ver 0.2.0");
		System.out.println("---------------------------------");
		
		while(true) {
			System.out.print("1. 입력 2. 결과 0. 종료>");
			input=sc.nextLine();
			if(input.equals("1")) {
				table += "\n"+(++num) + "    |";
				System.out.print(num+"학번 국어>");
				table += sc.nextLine() + "     |";
				System.out.print(num+"학번 영어>");
				table += sc.nextLine() + "     |";
				System.out.print(num+"학번 수학>");
				table += sc.nextLine();
			}else if(input.equals("2")) {
				System.out.println("---------------------------------");
				System.out.println(table);
				System.out.println("---------------------------------");
			}else if(input.equals("0")) {
				System.out.println("이용해주셔서 감사합니다.");	
				sc.close();
				break;	
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
