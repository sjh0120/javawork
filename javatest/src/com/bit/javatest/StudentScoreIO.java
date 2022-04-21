package com.bit.javatest;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
	int sNum;
	String name;
	int kor, eng, math;
}

public class StudentScoreIO {
	static ArrayList<Student> list=new ArrayList<>();
	static File file=new File("data.txt");
	
	public static void fileReader() {
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		try {
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			if(!file.exists())file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String input;
		System.out.println("학생 성적 관리 프로그램(ver 0.6.1)");
		System.out.println("----------------------------------");
		while(true) {
			System.out.print("1.입력 2.보기 3.수정 4.삭제 0.종료");
			input=sc.nextLine();
			
			if(input.equals("0")) {
				System.out.println("종료합니다");
				sc.close();
				break;
			}else if(input.equals("1")) {
				Student stu=new Student();
				System.out.print("학번 : ");
				stu.sNum=Integer.parseInt(sc.nextLine());
				System.out.print("이름 : ");
				stu.name=sc.nextLine();
				System.out.print("국어 : ");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("영어 : ");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("수학 : ");
				stu.math=Integer.parseInt(sc.nextLine());
				list.add(stu);
				
			}else if(input.equals("2")) {
				
			}else if(input.equals("3")) {
				
			}else if(input.equals("4")) {
				
			}
		}
		
		

	}

}
