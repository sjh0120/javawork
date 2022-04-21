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

public class Ex09 {

	public static void main(String[] args) {
		int stuNum=0;
		int kor,eng, math;
		String score ="";
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String title = "학생 성적관리 프로그램(ver 0.2.0)";
		System.out.println(title);
		
		boolean tf1 = true;
		
		System.out.println("---------------------------");
		while(tf1) {
			System.out.print("1. 입력 2. 결과 0. 종료>");
			int choiceNum;
			choiceNum=sc.nextInt();
			switch(choiceNum) {
			case 1 :
				stuNum++;
				System.out.print(stuNum + "학번 국어>");
				kor = sc.nextInt();
				System.out.print(stuNum + "학번 영어>");
				eng = sc.nextInt();
				System.out.print(stuNum + "학번 수학>");
				math = sc.nextInt();
				score += kor+"," + eng +"," +math+",";
				break;
				
			case 2 :
				System.out.println("---------------------------");
				System.out.println("학번 |국어   |영어   |수학");
				for(int i=0; i<stuNum; i++) {
					String[] scoreArr = score.split(",");
					System.out.println((i+1) + "    | " + scoreArr[3*i] + "    |" + scoreArr[3*i+1] + "     |" + scoreArr[3*i+2]);
				}
				System.out.println("---------------------------");
				break;
				
			case 0 :
				System.out.println("이용해주셔서 감사합니다");
				sc.close();
				tf1 = false;
				break;
				
			default :
				System.out.println("잘못된 입력입니다");
				break;
			}
		}
	}
}
