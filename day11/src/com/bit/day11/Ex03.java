package com.bit.day11;

import java.io.File;

public class Ex03 {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\BIT\\javawork\\day11\\test2.txt");
		if(file.exists()) {
			boolean result=file.delete();
			if(result) System.out.println("삭제 완료");
			else System.out.println("삭제 실패");
			
		}else {
			System.out.println("파일이 없습니다");
		}

	}

}
