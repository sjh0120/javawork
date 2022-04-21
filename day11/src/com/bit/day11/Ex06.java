package com.bit.day11;

import java.io.File;

public class Ex06 {

	public static void main(String[] args) {
		File before=new File("ex02.txt");
		File after=new File("test02\\ex02.txt");
		
		boolean result=before.renameTo(after);
		System.out.println(result);
		

	}

}
