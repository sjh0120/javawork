package com.bit.day10;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("주소를 입력하세요 >");
			String path=sc.nextLine();
			File file1=new File(path);
			String[] msgs=file1.list();
			
			int size=0;
			int fileCount=0;
			int dirCount=0;
			
			for(int i=0; i<msgs.length; i++) {
				File file2=new File(file1.getAbsolutePath() + "\\" + msgs[i]);
				int file2Size;
				Date date=new java.util.Date(file2.lastModified());			

				System.out.print(new SimpleDateFormat("yyyy-MM-dd aa hh:mm").format(date)+ "\t");
				
				if(file2.isDirectory()) {
					System.out.print("<DIR> \t \t");
					dirCount++;
				}else {
					file2Size=(int) file2.length();
					System.out.print("\t" + file2Size + "\t");
					size+=file2Size;
					fileCount++;
				}
				
				System.out.print(file2.getName());
				System.out.println();
			}
			System.out.println(fileCount + "개 파일 \t" + size + "바이트");
			System.out.println(dirCount + "개 디렉토리");
			sc.close();
		
		
		}catch(Exception e) {
			System.out.println("잘못된 입력입니다");
			
		}
	}
}
