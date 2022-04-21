package com.bit.day07;

public class Ex11 {

	public static void main(String[] args) {
		try {
			func();
		}catch(java.lang.ArithmeticException e) {
			System.out.println("에러해결");
		}
	}
	
	public static void func() throws java.lang.ArithmeticException {
		try {
			int su=1/0;
		}catch(ArithmeticException e){
			throw e;
		}
	}

}
