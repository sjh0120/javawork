package com.bit.day09;

import java.util.Scanner;

public class Test03 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("학생 성적관리 프로그램(ver 0.3.0)");
       System.out.println("----------------------------");
       
       String[] divAllInfo;
        String stuInfo="";
        
        int stuCount=0;
       
       while(true) {
            System.out.print("1. 입력 2. 결과 3. 수정  4. 삭제   0. 종료>");
            String input = sc.nextLine();
            
            String[] msg= new String[] {"국어", "영어", "수학"};
            
            if(input.equals("0")) {
               sc.close(); break;
            }
            else if(input.equals("1")) {
              System.out.print("학생의 학번 >");//학번 중복 막아야함
               stuInfo+=sc.nextLine() + " ";
               System.out.print("학생의 국어점수 >");
               stuInfo+=sc.nextLine() + " ";
               System.out.print("학생의 영어점수 >");
               stuInfo+=sc.nextLine() + " ";
               System.out.print("학생의 수학점수 >");
               stuInfo+=sc.nextLine() + " ";

            }else if(input.equals("2")) {
               System.out.println("----------------------------");
               System.out.println("학번  |국어   |영어   |수학  ");
               
               //divStuLabel 학생별 학번 국어 영어 수학 나눔
               divAllInfo=stuInfo.split(" ");
               stuCount=divAllInfo.length/4;
               for(int i=0; i<stuCount; i++) {
                  if(!divAllInfo[4*i+0].equals("")) {
                     System.out.println(divAllInfo[4*i+0] + "   " + divAllInfo[4*i+1] + "      " + divAllInfo[4*i+2] + "      " + divAllInfo[4*i+3]);
                  }
               }
               
               System.out.println("----------------------------");
            }else if(input.equals("3")){
               boolean tf1=false;
               int tempNum=0;
               divAllInfo=stuInfo.split(" ");
               stuCount=divAllInfo.length/4;
               System.out.println("----------------------------");
               if(stuCount==0) {
                  System.out.println("입력된 학생이 없습니다");
                  continue;
               }else {
                  System.out.print("수정할 학생의 학번>");
                  String stuNumCheck=sc.nextLine();
                  
                  for(int i=0; i<stuCount; i++) {
                     if(divAllInfo[i*4].equals(stuNumCheck)) {
                        tempNum=i;
                        tf1=true;
                     }
                  }
                  while(tf1) {
                     System.out.println("국어 : 1  영어 : 2  수학 : 3");
                     System.out.print("변경할 과목을 선택하세요 >");
                     String changeNumber=sc.nextLine();
                     if(changeNumber.equals("1")) {
                        stuInfo=func01(msg[0], changeNumber, tempNum, divAllInfo, 1);
                        break;
                     }else if(changeNumber.equals("2")) {
                    	stuInfo=func01(msg[1], changeNumber, tempNum, divAllInfo, 2);
                        break;
                     }else if(changeNumber.equals("3")) {
                    	stuInfo=func01(msg[2], changeNumber, tempNum, divAllInfo, 3);
                        break;
                     }else {
                        System.out.println("잘못된 입력");
                        continue;
                     }
                  }
                  if(tf1==false) {
                     System.out.println("일치하는 학생이 없습니다.");
                  }
               } 
            }else if(input.equals("4")){
               int tempNum=0;
               boolean tf1=false;
                System.out.println("----------------------------");
               divAllInfo=stuInfo.split(" ");
               stuCount=divAllInfo.length/4;
                if(stuCount==0) {
                  System.out.println("입력된 학생이 없습니다");
                  continue;
                }else {
                  System.out.print("수정할 학생의 학번>");
                  String stuNumCheck=sc.nextLine();
                  for(int i=0; i<stuCount; i++) {
                     if(divAllInfo[i*4].equals(stuNumCheck)) {
                        tempNum=i;
                        tf1=true;
                     }
                  }
                  while(tf1) {
                     String stuInfoChange="";
                     System.out.println("삭제합니다~");
                     for(int i=0; i<4; i++) {
                        divAllInfo[tempNum*4+i]="";
                     }
                     for(int i=0; i<divAllInfo.length; i++) {
                        stuInfoChange+=divAllInfo[i] + " ";
                     }
                     stuInfo=stuInfoChange;    
                     break;
                  }
                  if(tf1==false) {
                     System.out.println("일치하는 학생이 없습니다.");
                  }
               }
               System.out.println("----------------------------");
            }else {
               System.out.println("메뉴를 확인하시고 다시 입력바랍니다");
            }
         }
         System.out.println("이용해주셔서 감사합니다.");
   }
   
   public static String func01(String msg, String changeNumber, int tempNum, String[] divAllInfo, int j) {
	   Scanner sc=new Scanner(System.in);
	   String stuInfoChange="";
	   System.out.println(msg+" 이전 값 >" + divAllInfo[tempNum*4+1]);
	   System.out.print(msg+" 변경할 값 >");
	   String tempScore=sc.nextLine();
	   
	   divAllInfo[tempNum*4+j]=tempScore;
       
       for(int i=0; i<divAllInfo.length; i++) {
          stuInfoChange+=divAllInfo[i] + " ";
       }
	   return stuInfoChange;
   }
}