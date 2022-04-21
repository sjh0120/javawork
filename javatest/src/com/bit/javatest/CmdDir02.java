package com.bit.javatest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CmdDir02 {

	public static void main(String[] args) {
		String path="C:\\Users\\BIT\\javawork\\javatest";
		path=".";
		File file=new File(path);
		
		if(file.exists()) {
			try {
				path=file.getCanonicalPath();
				file=new File(path);
				if(file.isDirectory()) {
					String[] arr=file.list();
					for(int i=0; i<arr.length; i++) {
						ShowFileInfo(new File(file.getPath()+"\\" + arr[i]));
					}
				}else {
					ShowFileInfo(file);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("잘못된 경로");
		}
		
	}
	
	//파일의 정보를 출력(yyyy-MM-dd a.p. hh:mm ["<DIR>"] [length] name)
	public static void ShowFileInfo(File temp) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd aa hh:mm");
		String dayPrint=sdf.format(new Date(temp.lastModified()));
		System.out.print(dayPrint + "\t");
		if(temp.isDirectory()) {
			System.out.print("<DIR>\t\t");
		}else {
			System.out.print("\t" + temp.length() + "\t");
		}
		
		System.out.println(temp.getName());
	}

}
