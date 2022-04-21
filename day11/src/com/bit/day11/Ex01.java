package com.bit.day11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//절대경로를 입력해도 정상적으로 나오도록
//상대경로를 입력하더라도 정상적으로 나오도록
//경로가 없다면? 파일이라면? => 까지 과제
//상대경로상태에서 파일이라면? => 까지 과제
//cmd와 최대한 동일하게 만들기 => 과제

public class Ex01 {

	public static void main(String[] args) {
		System.out.print("주소를 입력하세요 > ");
		Scanner sc=new Scanner(System.in);
		String path=sc.nextLine();
		File root=new File(path);
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
				//1970과 같은 없는 시간이 출력되는 이유 -> 
				//file을 통해 파일명을 받아오고 상대경로의 값을 패키지에 영향을 받는다
				//이때 file명을 받아왔지만 상대경로인 패키지파일에 그 파일이 없는 경우 수정정보를 받아오지 못하기 때문에
				//1970으로 받아온다!
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
			
			System.out.println(fileCount + "개 파일 \t" + size + "바이트");
			System.out.println(dirCount + "개 디렉토리");
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
			}
			System.out.println(fileCount + "개 파일 \t" + size + "바이트");
			System.out.println(dirCount + "개 디렉토리");
		}
	}
}
