package com.bit.day07;

public class Ex07 {
	public static boolean tf1;

	public static void main(String[] args) {
		// 입력을 받아서 주민번호 검사기
		// 주민번호 입력>991231-1234567
		// 22세 남성입니다
		
		// 주민번호 입력>001234-4234567
		// 1세 여성입니다
		
		// 주민번호 입력>0012344234567
		// -를 생략하지 마시고 입력바랍니다
		// 주민번호 입력>001234-423456
		// 입력을 다시 확인하세요
		// 주민번호 입력>
		/*
		System.out.println("입력을 받아서 주민번호 검사기");
		String codeNum;
		int age;
		String gender;
		String[] arr1=new String[3];
		java.util.Scanner sc=new java.util.Scanner(System.in);	
		while(true) {
			System.out.print("주민번호 입력>");
			codeNum = sc.nextLine();
			if(codeNum.charAt(6)=='-') {
				if(codeNum.length() < 14) {
					System.out.println("입력을 다시 확인하시고 입력하세요");
				}else {
					arr1=codeNum.split("-");
					if(Integer.parseInt(arr1[0])/10000<=22) {
						age=2022-(Integer.parseInt(arr1[0])/10000+2000) +1;
						
					}else {
						age=2022-(Integer.parseInt(arr1[0])/10000+1900) +1;
					}
					if(Integer.parseInt(arr1[1])/1000000 == 1 || Integer.parseInt(arr1[1])/1000000 == 3) {
						gender="남";
					}else{
						gender="여";
					}
					System.out.println(age + "세 " + gender + "성입니다");
				}
			}else {
				System.out.println("-를 생략하지 마시고 입력바랍니다");
			}
		}
		*/
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("주민번호 검사기(ver 0.2.0)");
		boolean boo=true;
		int age=1;
		char gender='남';
		int year=0;
		while(boo) {
			System.out.print("주민번호 입력>");
			String input=sc.nextLine();
			
			if(input.charAt(7)>'2')year=1;
			age = 1+2022-Integer.parseInt("19"+input.substring(0,2))-100*year;
			if(input.charAt(7)%2=='2'%2) gender='여';
			boo=false;
		}
		System.out.println(age + "세 " + gender + "성입니다");
		boo=true;
	}
}

