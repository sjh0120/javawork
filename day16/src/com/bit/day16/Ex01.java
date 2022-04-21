package com.bit.day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Student implements Serializable{
	int num;
	String name;
	int kor,eng,math;
}

public class Ex01 extends Thread{
	
	File file=new File("data.txt");
	static ArrayList<Student> list=new ArrayList<>();
	
	@Override
	public void run() {
		while(true) {
			try {
				sleep(20*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			fileWrite();
		}
	}
	
	public void fileRead() {
		if(!file.exists()) {fileWrite();}
		//파일이 존재하지 않더라도 공백 데이터를 삽입
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			list=(ArrayList<Student>) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ois!=null)ois.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileWrite() {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			if(!file.exists())file.createNewFile();
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			oos.close();
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Ex01 me=new Ex01();
		me.fileRead();
		me.setDaemon(true);
		//데몬스레드를 통해 fileWrite()를 계속 수행함
		//me 스레드의 run에 들어가 있기 때문에!
		me.start();
		Scanner sc=new Scanner(System.in);
		System.out.println("학생 성적관리 프로그램(ver0.6.0)");
		String input=null;
		
		while(true) {
			System.out.print("1.입력 2.보기 3.수정 4.삭제 0.종료>");
			input=sc.nextLine();		
			
			if(input.equals("0")) {//종료
				sc.close();
				break;
			}else if(input.equals("1")) {//입력
				Student stu=new Student();
				System.out.print("학번>");
				input=sc.nextLine();
				stu.num=Integer.parseInt(input);
				System.out.print("이름>");
				input=sc.nextLine();
				stu.name=input;
				System.out.print("국어>");
				input=sc.nextLine();
				stu.kor=Integer.parseInt(input);
				System.out.print("영어>");
				input=sc.nextLine();
				stu.eng=Integer.parseInt(input);
				System.out.print("수학>");
				input=sc.nextLine();
				stu.math=Integer.parseInt(input);
				list.add(stu);
			}else if(input.equals("2")) {//보기
				System.out.println("-------------------------------------------------");

				System.out.println("학번\t이름\t국어\t영어\t수학\t평균");
				System.out.println("-------------------------------------------------");
				
				for(int i=0; i<list.size();i++) {
					Student stu=list.get(i);
					System.out.println(stu.num +"\t" + stu.name +"\t" + stu.kor+"\t" + stu.eng+"\t" + stu.math+"\t" + (stu.kor+stu.eng+stu.math)*100/3/100.0);
				}
				System.out.println("-------------------------------------------------");
			}else if(input.equals("3")) {//수정
				
			}else if(input.equals("4")) {//삭제
				
			}else {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			
			
		}
	}

}
