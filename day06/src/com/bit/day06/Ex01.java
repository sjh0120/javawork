package com.bit.day06;

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
public class Ex01 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("학생 성적관리 프로그램(ver 0.2.0");
		System.out.println("----------------------------");
		int num=0;
		String table="학번  |국어   |영어   |수학  ";
		while(true) {
			System.out.print("1. 입력 2. 결과 0. 종료>");
			String input = sc.nextLine();
			
			if(input.equals("0")) {
				sc.close(); break;
			}
			else if(input.equals("1")) {
				table+="\n" +(++num);
				//String[] sub = {"국어","영어","수학"};
//				for(int i=0; i<sub.length; i++) {
//					System.out.print(num+"학번 "+sub[i]+">");
//					table+="     |"+sc.nextLine();
//				}
				table += func01(num,sc,"국어");
				table += func01(num,sc,"영어");
				table += func01(num,sc,"수학");
//				System.out.print(num+"학번 국어>");
//				table+="    |"+sc.nextLine();
//				System.out.print(num+"학번 영어>");
//				table+="     |"+sc.nextLine();
//				System.out.print(num+"학번 수학>");
//				table+="     |"+sc.nextLine();
				
			}else if(input.equals("2")) {
				System.out.println("----------------------------");
				System.out.println(table);
				System.out.println("----------------------------");
			}else {
				System.out.println("메뉴를 확인하시고 다시 입력바랍니다");
			}
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
	
	public static String func01(int num, java.util.Scanner sc, String sub) {
		System.out.print(num+"학번 "+sub+">");
		return "     |"+sc.nextLine();
	}
}
