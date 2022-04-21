package com.bit.day11;

import java.io.File;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\BIT\\javawork\\day11\\test2.txt");
		if(!file.exists()) {
			try {
				
				boolean result=file.createNewFile();
				if(result)	System.out.println("파일 생성 완료");
				else System.out.println("생성실패");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("동일 파일명이 존재합니다");
		}

	}

}
