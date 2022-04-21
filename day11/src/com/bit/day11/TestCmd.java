package com.bit.day11;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestCmd {

	static boolean tf=false;
	
	public static void main(String[] args) {
		System.out.print("주소를 입력하세요 > ");
		Scanner sc=new Scanner(System.in);
		String path=sc.nextLine();
		if((path.contains(".") || path.contains(".."))&& path.length()<3) {
			tf=true;
		}
		File root=null;
		if(path.trim().equals("") || tf==true) {
			File temp=new File(".");
			root=new File(temp.getAbsoluteFile(), path);
		}else {
			root=new File(path);
		}
		String[] list=root.list();
		String[] list2=null;
		
		int size=0;
		int fileCount=0;
		int dirCount=0;
		
		if(root.exists() && root.isDirectory()) {
			if(root.getParent()==null) {
				list2=list;
			}else{
				list2=new String[list.length+2];
				list2[0]=".";
				list2[1]="..";
				System.arraycopy(list, 0, list2, 2, list.length);
			}

			for(int i=0; i<list2.length; i++) {
				File file=new File(root.getAbsolutePath() + "\\" +list2[i]);
				if(!file.isHidden()) {
					Date date=new java.util.Date(file.lastModified());
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd aa hh:mm");
					String msg= sdf.format(date);
					System.out.print(msg + "\t");
					if(file.isDirectory()) {
						System.out.print("<DIR>\t \t");
						dirCount++;
					}else {
						System.out.print("\t" + file.length() + "\t");
						fileCount++;
						size+=file.length();
					}
					System.out.println(list2[i]);
				}
			}
			
			System.out.println(fileCount + "개 파일 \t" + size + "바이트");
			System.out.println(dirCount + "개 디렉토리");
			sc.close();
		}else {
			System.out.println("볼륨에는 이름이 없습니다");
			if(root.exists()) { 
				Date date=new Date(root.lastModified());
				java.text.SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd aa hh:mm");
				String msg=sdf.format(date);
				System.out.print(msg + "\t");
				if(root.isDirectory()) {
					System.out.print("<DIR>\t \t");
					dirCount++;
				}else {
					System.out.print("\t" + root.length() + "\t");
					fileCount++;
					size+=root.length();
				}
				
				System.out.println(root.getName());
				System.out.println(fileCount + "개 파일 \t" + size + "바이트");
				System.out.println(dirCount + "개 디렉토리");
			}else {
				System.out.println("올바른 값이 아닙니다");
			}
			
			sc.close();
		}
	}
}
