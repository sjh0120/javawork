package com.bit.day11;

import java.io.*;

public class Ex16 {

	public static void main(String[] args) {
		PrintStream consoleOut=System.out;
		System.out.print("asdf");
		// ㄴ> System.out은 PrintStream이다!
		
		File file=new File("test16.txt");
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		PrintStream ps=null;
		
		try {
			if(!file.exists()) file.createNewFile();
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos);//bos 장착을 통한 성능 향상!
			ps=new PrintStream(bos);//문자열 처리 속도 향상!(문자열 처리 쉽게)
			//print 즉 Output을 목적으로 하는 필터클래스
			//OutputStream만을 제공한다!
			ps.print("a");
			ps.println();
			ps.println(1234);
			ps.println("!@#$");
			
			ps.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

}
