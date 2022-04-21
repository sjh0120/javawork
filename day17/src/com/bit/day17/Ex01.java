package com.bit.day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String data="";
		System.out.println("성적관리 프로그램(ver 0.5.9)");
		File file=new File("data.txt");
		FileReader fr=null;
		FileWriter fw=null;
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try {
			if(!file.exists()) file.createNewFile();	
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
			while(true) {
				String msg=br.readLine();
				if(msg==null) break;
				data+=msg+"\n";
			}
			
			if(data==null) data="";
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(fr!=null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		String input=null;
		while(true) {
			System.out.print("1.입력 2.보기 3.수정 4.삭제 0.종료>");
			input=sc.nextLine();
			if(input.equals("0")) break;
			if(input.equals("1")) {
				String[] title="학번\t이름\t국어\t영어\t수학\t평균".split("\t");
				for(int i=0; i<title.length-1; i++) {
					System.out.print(title[i]+">");
					input=sc.nextLine();
					data+=input+"\t";
				}
				data+="\n";
				////
				try {
					fw=new FileWriter(file);
					bw=new BufferedWriter(fw);
					
					bw.write(data);
					bw.flush();
				} catch (IOException e) {
					e.printStackTrace();
				} finally{
					try {
						if(bw!=null)bw.close();
						if(fw!=null)fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}	
				}
				////
			}else if(input.equals("2")) {
				System.out.println("-----------------------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학\t평균");
				System.out.println("-----------------------------------------------------");
				String[] stus=data.split("\n");
				if(!data.isEmpty()) {
					System.out.println("size" + stus.length);
					for(int i=0; i<stus.length; i++) {
						String[] stu=stus[i].split("\t");
						int kor=Integer.parseInt(stu[2]);
						int eng=Integer.parseInt(stu[3]);
						int math=Integer.parseInt(stu[4]);
						double avg=(kor+eng+math)*100/3/100.0;
						System.out.println(stus[i] + avg);
					}
				}
				System.out.println("-----------------------------------------------------");
			}else if(input.equals("3")){
				System.out.print("수정할 학번>");
				input=sc.nextLine();
				input="\r\n"+input+"\t";
				//data.indexOf(input);
				//ㄴ>\r의 인덱스 번호가 넘어옴. 따라서
				int startIdx=data.indexOf(input)+2;
				int endIdx=startIdx+data.substring(startIdx).indexOf("\r");
				//startIdx에서 endIdx까지의 값을 수정하면 수정
			}else if(input.equals("4")) {
				System.out.print("삭제할 학번>");
				input=sc.nextLine();
				input="\n"+input+"\t";
				//data.indexOf(input);
				//ㄴ>\r의 인덱스 번호가 넘어옴. 따라서
				int startIdx=data.indexOf(input)+2;
				int endIdx=startIdx+data.substring(startIdx).indexOf("\n");
				//startIdx에서 endIdx까지의 값을 수정하면 수정
				data=data.replace(data.substring(startIdx, endIdx), "");
				
//				System.out.println("input:"+input);
//				System.out.println("내용1:"+startIdx);
//				System.out.println("내용1 c:"+data.charAt(startIdx+1));
//				
//				System.out.println("내용2:"+data.substring(startIdx).indexOf("\n"));
//				System.out.println("내용2c:"+data.charAt(data.substring(startIdx).indexOf("\n")));
//				System.out.println("내용3:"+data.substring(startIdx-1, endIdx));
			}else {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			
			
		}
		
		
		
	}
}
