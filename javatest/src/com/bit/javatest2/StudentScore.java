package com.bit.javatest2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Student{
	int cstuNum;
	int kor, eng, math;
	String name;
	
}

public class StudentScore{
	static int stuNum=0;
	static File file=new File("StudentData.txt");
	
	static FileReader fr=null;
	static FileWriter fw=null;
	static BufferedReader br=null;
	static BufferedWriter bw=null;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String printResult="";
		
		ArrayList<Student> stuList=new ArrayList<>();
		
		System.out.println("학생 성적관리 프로그램 (ver 0.6.0)");
		System.out.println("----------------------------------");
		
		int input=0;
		
		//파일이 없으면 파일 생성
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		while(true) {
			//System.out.println("줄수" +lineCnt);
			System.out.print("1.입력 2.보기 3.수정 4.삭제 0.종료 >");
			
			
			input=Integer.parseInt(sc.nextLine());
			if(input==0) {
				System.out.println("종료합니다");
				sc.close();
				break;
				
			}else if(input==1) {
				String stuData="학번:" + (++stuNum)+",\t";
				System.out.print("이름 >");
				stuData+="이름:" + sc.nextLine() +",\t\t";
				System.out.print("국어 >");
				stuData+="국어:" + sc.nextLine() +",\t";
				System.out.print("영어 >");
				stuData+="영어:" + sc.nextLine() +",\t";
				System.out.print("수학 >");
				stuData+="수학:" + sc.nextLine() +",\t";
				
				//문자열을 통한 파일에 값전송
				try {
					String result="";
					fr=new FileReader(file);
					br=new BufferedReader(fr);
					int su=-1;
					while((su=br.read())!=-1) {
						char temp=((char)su);
						result=result+temp;
					}
					br.close();
					fr.close();
					
					fw=new FileWriter(file);
					bw=new BufferedWriter(fw);
					if(result!=null) {
						bw.write(result + stuData);
						bw.newLine();
						bw.close();
						fw.close();
					}
						
				} catch (IOException e) {
					e.printStackTrace();
				}
				continue;
				
			}else if(input==2) {
				int lineCnt=0;
				System.out.println("-----------------------------------------------------");
				System.out.println("학번\t이름\t\t국어\t영어\t수학\t평균");
				System.out.println("-----------------------------------------------------");
				
				
				//문자열을 통한 파일읽어오기
				try {
					String result="";
					fr=new FileReader(file);
					br=new BufferedReader(fr);
					int su=-1;
					while((su=br.read())!=-1) {
						int cnt=1;
						char temp=((char)su);
						if(temp=='\n')cnt++;
						result=result+temp;
						lineCnt=cnt;
					}
					br.close();
					fr.close();
					
					//데이터 다듬기
					printResult=result.substring(0,result.length()-2);
					printResult=printResult.replace("학번:", "");
					printResult=printResult.replace("이름:", "");
					printResult=printResult.replace("국어:", "");
					printResult=printResult.replace("영어:", "");
					printResult=printResult.replace("수학:", "");
				} catch (IOException e) {
					e.printStackTrace();
				}
				String[] score=new String[] {};
				score=printResult.split(",");
				
				String[] fPrint=new String[] {};
				fPrint=printResult.replace(",","").split("\r\n");
				for(int i=0; i<fPrint.length; i++) {
					System.out.println(fPrint[i] + (int)((Integer.parseInt(score[5*i+2].trim())+Integer.parseInt(score[5*i+3].trim())+Integer.parseInt(score[5*i+4].trim()))/3)*100/100.0);
				}
				
				System.out.println("-----------------------------------------------------");
				
			}else if(input==3) {
				String tempString="";
				System.out.print("수정할 학생의 학번을 입력하세요 > ");
				input=Integer.parseInt(sc.nextLine());
				String[] stuScore=new String[] {};
				String[] stuCheck=new String[5];
				try {
					String result="";
					String tempResult="";
					fr=new FileReader(file);
					br=new BufferedReader(fr);
					int su=-1;
					while((su=br.read())!=-1) {
						char temp=((char)su);
						result=result+temp;
					}
					br.close();
					fr.close();
					
					stuScore=result.split("\r\n");
					//객체에 데이터 저장
					for(int i=0; i<stuScore.length; i++) {
						
						Student studata=new Student();
						tempString=stuScore[i].replace("학번:", "");
						tempString=tempString.replace("이름:", "");
						tempString=tempString.replace("국어:", "");
						tempString=tempString.replace("영어:", "");
						tempString=tempString.replace("수학:", "");
						stuCheck=tempString.split(",");
						studata.cstuNum=Integer.parseInt(stuCheck[0].trim());
						studata.name=stuCheck[1].trim();
						studata.kor=Integer.parseInt(stuCheck[2].trim());
						studata.eng=Integer.parseInt(stuCheck[3].trim());
						studata.math=Integer.parseInt(stuCheck[4].trim());
						
						stuList.add(studata);
					}
					
					
					for (int i = 0; i <stuList.size(); i++) {
						Student studata = stuList.get(i);
						if (studata.cstuNum==input) {
							System.out.print("국어 > ");
							studata.kor = Integer.parseInt(sc.nextLine());
							System.out.print("영어 > ");
							studata.eng = Integer.parseInt(sc.nextLine());
							System.out.print("수학 > ");
							studata.math = Integer.parseInt(sc.nextLine());
							System.out.println("수정완료!!!");
						}
						tempResult=tempResult+"학번:"+stuList.get(i).cstuNum + ",\t" + "이름:"+stuList.get(i).name + ",\t\t" +"국어:"+stuList.get(i).kor + ",\t" +"영어:"+stuList.get(i).eng + ",\t" +"수학:"+stuList.get(i).math + ",\t\r\n";
						
					}
					fw=new FileWriter(file);
					bw=new BufferedWriter(fw);
					bw.write(tempResult);
					bw.flush();
					bw.close();
					fw.close();
					

				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}else if(input==4) {
				String tempString="";
				System.out.print("삭제할 학생의 학번을 입력하세요 > ");
				input=Integer.parseInt(sc.nextLine());
				String[] stuScore=new String[] {};
				String[] stuCheck=new String[5];
				try {
					String result="";
					String tempResult="";
					fr=new FileReader(file);
					br=new BufferedReader(fr);
					int su=-1;
					while((su=br.read())!=-1) {
						char temp=((char)su);
						result=result+temp;
					}
					br.close();
					fr.close();
					
					stuScore=result.split("\r\n");
					//객체에 데이터 저장
					for(int i=0; i<stuScore.length; i++) {
						
						Student studata=new Student();
						tempString=stuScore[i].replace("학번:", "");
						tempString=tempString.replace("이름:", "");
						tempString=tempString.replace("국어:", "");
						tempString=tempString.replace("영어:", "");
						tempString=tempString.replace("수학:", "");
						stuCheck=tempString.split(",");
						studata.cstuNum=Integer.parseInt(stuCheck[0].trim());
						studata.name=stuCheck[1].trim();
						studata.kor=Integer.parseInt(stuCheck[2].trim());
						studata.eng=Integer.parseInt(stuCheck[3].trim());
						studata.math=Integer.parseInt(stuCheck[4].trim());
						
						stuList.add(studata);
					}
					
					
					for (int i = 0; i <stuList.size(); i++) {
						Student studata = stuList.get(i);
						if (studata.cstuNum==input) {
							stuList.remove(i);
						}else {
							tempResult=tempResult+"학번:"+studata.cstuNum + ",\t" + "이름:"+studata.name + ",\t\t" +"국어:"+studata.kor + ",\t" +"영어:"+studata.eng + ",\t" +"수학:"+studata.math + ",\t\r\n";
						}
					}
					//ArrayList<Student> tempList=new ArrayList<>();
//					tempList=stuList;
//					for(int i=0; i<tempList.size(); i++) {
//						Student studata=tempList.get(i);
//						tempResult=tempResult+"학번:"+studata.cstuNum + ",\t" + "이름:"+studata.name + ",\t\t" +"국어:"+studata.kor + ",\t" +"영어:"+studata.eng + ",\t" +"수학:"+studata.math + ",\t\r\n";
//					}
					fw=new FileWriter(file);
					bw=new BufferedWriter(fw);
					bw.write(tempResult);
					bw.flush();
					bw.close();
					fw.close();
					

				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}else {
				System.out.println("잘못된 입력입니다");
				continue;
				
			}
		}
	
	}
}

