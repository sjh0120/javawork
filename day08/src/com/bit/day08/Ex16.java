package com.bit.day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream inn=System.in;
		java.util.Scanner sc;
		/*개행을 읽어온다면
		sc=new Scanner("ABCDEF\nabcefdf\n123124");
		
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		*/
		
		/*
		//파일 안의 3줄 까지 가져온다
		sc=new Scanner(new File("test.txt"));
		
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		*/
		
		/*
		sc=new Scanner("ABCDEF\nabcdef\n!@#$%^");
		
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		*/
		
		
		//그렇다면 next()와 nextLine()의 차이점은?
		//nextLine() \n(개행)이 구분의 단위(구분자)로 사용
		//next() \n(개행) 탭 스페이스바 등이 구분의 단위(구분자)로 사용
		
		/*abcd가 앞에 스페이스바와 같이 나옴
		sc=new Scanner("1234 abcd\n4321");
		
		System.out.println(sc.nextInt() + 1);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextInt() + 1);
		*/
		
		/*고장남
		sc=new Scanner(inn);
		
		System.out.println(sc.nextInt());
		System.out.println(sc.next());
		System.out.println(sc.nextInt());
		System.out.println(sc.next());
		*/
		
		//즉 nextLine nextInt와 같은 방법들을 꼬아서 하지말고
		//되도록이면 nextLine()으로 정상적으로 다 받아와서
		//parseInt와 같은 방법으로 변형해서 써라!
		
	}

}
