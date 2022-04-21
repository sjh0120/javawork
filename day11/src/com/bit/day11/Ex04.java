package com.bit.day11;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		//2, 3번
		//String path="test01\\sub01";
		
		//boolean result=file.mkdirs();//test01 아래 sub01이 없다면 바로 생성
		//if(result) System.out.println("디렉토리 생성완료");
		//else System.out.println("디렉토리 생성실패");
		
		//1번
		String path="test01\\sub01";
		File file=new File(path);
		
		String parent=file.getParent();
		File before=file;
		while(true) {
			String path1=file.getParent();
			try {	
				before=new File(path1);
				before.mkdir();
				before=file;
				if(path1.equals(parent)) break;
			}catch(Exception e) {
				continue;
			}
		
		}
		file.mkdir();
		//1번 끝
		
		//2번
//		String path1="test01";
//		File before=new File(path1);
//		before.mkdir();
//		boolean result = file.mkdir();
//		if(result) System.out.println("디렉토리 생성완료");
//		else System.out.println("디렉토리 생성 실패");

//		String[] arr=path.split("\\\\");
//		System.out.println(Arrays.toString(arr));
//		String path1="";
//		for(int i=0; i<arr.length; i++) {
//			if(i!=0) path1+="\\";
//			path1+=arr[i];
//			File before=new File(path1);
//			before.mkdir();
//		}
		//2번끝
		
		//3번
//		boolean result=file.mkdirs();//test01 아래 sub01이 없다면 바로 생성
//		if(result) System.out.println("디렉토리 생성완료");
//		else System.out.println("디렉토리 생성실패");
		//3번끝

	}

}
