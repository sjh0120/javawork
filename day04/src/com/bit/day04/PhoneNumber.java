package com.bit.day04;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phoneNum = sc.next();		
		sc.close();
		
		String result = "";
		
		if(phoneNum.length() < 4) {
			System.out.println("4자리 이상 입력하십시오");
		}else {
			for(int i=0; i<phoneNum.length(); i++) {
				if(i<phoneNum.length()-4) {
					result += "*";
				}else {
					result +=phoneNum.charAt(i);
				}
			}
		}
		System.out.println(result);
	}
}
