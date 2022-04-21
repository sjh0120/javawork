package com.bit.day07;

//입력을 받아서 주민번호 검사기
		// 주민번호 입력>991231-1234567
		// 22세 남성입니다
		
		// 주민번호 입력>001234-4234567
		// 1세 여성입니다

public class Ex09 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("주민번호 검사기(ver 0.2.0)");
		boolean boo=true;
		int age=1;
		char gender='남';
		int year=0;
		while(boo) {
			System.out.print("주민번호 입력>");
			String input=sc.nextLine();
			
			/*
			boolean digit=false;
			
			for(int i=0; i<14; i++) {
				if(i==6)continue;//'-'제외
				if(!Character.isDigit(input.charAt(i))) digit=true;
			}
			
			if(!input.contains("-")) {
				System.out.println("-를 생략하지 마시고 입력바랍니다");
				continue;		
			}else if(input.length()!=14) {
				System.out.println("입력을 다시 확인하세요");
				continue;
			}else if(digit) {
				System.out.println("입력을 다시 확인하세요");
				continue;
			}
			*/
			
			String[] arr=input.split("-");
			if(arr.length!=2) {
				System.out.println("입력포멧을 다시확인하세요");
				continue;
			}
			try {
				if(101>Integer.parseInt(arr[0]) ||Integer.parseInt(arr[0])>991231) {
					System.out.println("입력이 잘못되었습니다");
					continue;
				}
				
				if(1000000>Integer.parseInt(arr[1]) ||Integer.parseInt(arr[1])>5000000){
					System.out.println("입력이 잘못되었습니다");
					continue;
				}
			}catch(NumberFormatException e) {
				System.out.println("정확한 숫자로 작성해주세요");
				continue;
			}
			
			if(input.charAt(7)>'2')year=1;//2000년생 이후부턴 남자3 여자4
			age = 1+2022-Integer.parseInt("19"+input.substring(0,2))-100*year;
			if(input.charAt(7)%2=='2'%2) gender='여';
			boo=false;
		}
		System.out.println(age + "세 " + gender + "성입니다");
		boo=true;

	}

}
