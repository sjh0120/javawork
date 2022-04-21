package com.bit.day05;

public class Ex05 {

	public static void main(String[] args) {
		// 주민번호 확인
		// 주민번호를 입력하세요
		// input="991231-1234567";
		// 당신은 24세 남성입니다.
		// input="220101-4123456";
		// 당신은 1세 여성입니다.
		
		String input="991231-1234567";
		System.out.println("주민번호를 입력하세요>"+input);
		char[] arr1=input.toCharArray();
		int age=0;
		
		int year1=(arr1[0] - '0')*10+(arr1[0] - '0') + 1900;
		if(arr1[7]=='3'||arr1[7]=='4') year1+=100;
		age = 2022-year1+1;
		
		char gender='여';
		if(arr1[7]=='1'||arr1[7]=='3') gender='남';
		if(arr1[7]=='2'||arr1[7]=='4') gender='여';
		System.out.println("당신은 "+age+"세"+gender+"성입니다");
		
		/* 방법1
		String input1 = "991231-1234567";
		String input2 = "220101-4123456";
		String result1 ="";
		String result2 ="";
		
		char[] arr1 = input1.toCharArray();
		char[] arr2 = input2.toCharArray();
		String result3 = input1.substring(0,2);		
		String result4 = input2.substring(0,2);
		
		int age3 = 122-Integer.valueOf(result3) + 1;
		int age4 = 22-Integer.valueOf(result4) + 1;
		
		if(arr1[7] == '1') {
			result1 += "남성입니다";
		}
		if(arr1[7] != '1') {
			result1 += "여성입니다";
		}
		
		if(arr2[7] == '4') {
			result2 += "여성입니다";
		}
		if(arr2[7] != '4') {
			result2 += "남성입니다";
		}
		
		System.out.println(result1);
		System.out.println(result2);
		*/
		
		
		/* 방법2
		String input1 = "991231-1234567";
		String input2 = "220101-4123456";
		String result1 ="";
		String result2 ="";
		
		char[] arr1 = input1.toCharArray();
		char[] arr2 = input2.toCharArray();
		String str1 = String.valueOf(arr1[0])+ String.valueOf(arr1[1]);
		String str2 = String.valueOf(arr2[0])+ String.valueOf(arr2[1]);
		int age1 = 122-Integer.valueOf(str1) + 1;
		int age2 = 22-Integer.valueOf(str2) + 1;
		
		result1 += "당신은" + String.valueOf(age1) + "세";
		result2 += "당신은" + String.valueOf(age2) + "세";
		
		if(arr1[7] == '1') {
			result1 += "남성입니다";
		}
		if(arr1[7] != '1') {
			result1 += "여성입니다";
		}
		
		if(arr2[7] == '4') {
			result2 += "여성입니다";
		}
		if(arr2[7] != '4') {
			result2 += "남성입니다";
		}
		
		System.out.println(result1);
		System.out.println(result2);
		*/
		
		
	}

}
