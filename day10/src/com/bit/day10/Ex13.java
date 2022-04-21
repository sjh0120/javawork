package com.bit.day10;

import java.io.*;
import java.util.Arrays;

public class Ex13 {

	public static void main(String[] args) {
		/* 경로설정방법
		1. 절대경로 -> C:\Users\BIT\javawork\day10\abc.txt
		2. 상대경로 -> .\abc.txt =>" . "현재경로라는 의미 + .\는 생략가능
		+언제부터였는지 모르나 \이 아닌 /또한 주소로 지원해준다
		++윈도우 몇부터인지 모르니 \를 쓰도록 하자
		 */
		String path="C:\\Users\\BIT\\javawork\\day10\\test1";
		File file1=new File(path);
		System.out.println("존재하냐?" + file1.exists());
		System.out.println("디렉토리냐?" + file1.isDirectory());
		System.out.println("파일이냐?" + file1.isFile());
		
		System.out.println("경로1?" + file1.getParent()); //.\\abc.txt 혹은 abc.txt를 하면 . 또는 null값이 나옴
		System.out.println("경로2?" + file1.getPath());
		System.out.println("절대경로1?" + file1.getAbsolutePath());
		try {
			System.out.println("절대경로2?" + file1.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일명?"+file1.getName());
		System.out.println("r권한"+file1.canRead());
		System.out.println("w권한"+file1.canWrite());
		System.out.println("x권한"+file1.canExecute());
		System.out.println("사이즈?"+file1.length() + "byte");
		System.out.println("마지막 수정일자?"+new java.util.Date(file1.lastModified()));
		String[] msgs=file1.list();
		System.out.println(Arrays.toString(msgs));

		
	}

}
