package com.bit.day07;

public class Ex05 {

	public static void main(String[] args) {
		char ch1='가';
		Character ch2=new Character('A');
		
		//문자인지
		System.out.println(Character.isLetter(ch1));
		System.out.println(Character.isAlphabetic(ch1));
		//숫자인지
		System.out.println(Character.isDigit(ch1));
		//대문자인지
		System.out.println(Character.isUpperCase(ch1));
		//소문자인지
		System.out.println(Character.isLowerCase(ch1));
		//띄어쓰기인지
		System.out.println(Character.isSpace(ch1));
		System.out.println(Character.isWhitespace(ch1));
		

	}

}
