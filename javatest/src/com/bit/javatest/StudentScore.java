package com.bit.javatest;

import java.util.Scanner;

//이중 자료구조 안좋다
//배열또한 좋지 않다
//클래스를 통한 객체또한 무거워져서 안좋다

public class StudentScore {

   public static void main(String[] args) {
	   
	   int stuMax=30;
      
      System.out.println("학생 성적 관리 프로그램");
      Scanner sc=new Scanner(System.in);
      int input=0;
      String[] sub=new String[] {"기초문법", "백엔드", "프런트엔드"};
      int[][] stuList=new int[][] {};
      int stuNum=0;
      String[] stuName= new String[] {};
      
      while(true) {
         System.out.print("1.입력 2.조회 3.수정 4.삭제 0.종료 > ");
         try {
            input=Integer.parseInt(sc.nextLine());
         }catch(NumberFormatException e){
            System.out.println("숫자만 입력 가능합니다");
            continue;
         }
         System.out.println("-------------------------------------");
         if(input==0) {
            System.out.print("시스템을 종료합니다");
            sc.close();
            break;
         }else if(input==1) {
            stuNum++;
            if(stuNum>stuMax) {
            	System.out.println("학생 데이터는 최대 " + stuMax +"명까지 넣을 수 있습니다");
            	stuNum--;
            	continue;
            }
            int[][] beforeScore=stuList;
            String[] beforeName=stuName;
            stuList=new int[stuNum][];
            stuName=new String[stuNum];
            String name="";
            int[] stu=new int[sub.length];
            System.out.println("학생 성적을 입력합니다");
            System.out.print("학생의 이름 > ");
            name=sc.nextLine();
            stuName[stuNum-1]=name;
            
            for(int i=0; i<sub.length; i++) {
               boolean numCheck=false;
               while(!numCheck) {
                  System.out.print(sub[i] + " > ");
                  try {
                     stu[i]=Integer.parseInt(sc.nextLine());
                  }catch(NumberFormatException e) {
                     System.out.println("숫자만 입력가능합니다");
                     continue;
                  }
                  if(!NumCheck(stu[i],0,100)) continue;
                  else numCheck=true;
               }
            }
            
            stuList[stuNum-1]=stu;
            
            System.arraycopy(beforeScore, 0, stuList, 0, beforeScore.length);
            System.arraycopy(beforeName, 0, stuName, 0, beforeName.length);
            
         }else if(input==2) {
        	if(stuNum!=0) {
            System.out.println("학번\t이름\t기초\t백엔드\t프런트엔드\t평균");
            System.out.println("----------------------------------------------------");
            for(int i=0; i<stuList.length; i++) {
               int sum=0;
               String scoreString="";
               for(int j=0; j<stuList[i].length; j++) {
                  scoreString+=stuList[i][j] + "\t";
                  sum+=stuList[i][j];
               }
               
               System.out.println(" "+(i+1)+"\t"+stuName[i]+"\t" + scoreString+"\t"+(int)(sum/((double)sub.length)*100)/100.0);
            }
            System.out.println("----------------------------------------------------");
        	}else {
        		System.out.println("입력된 학생이 없습니다");
        		continue;
        	}
         }else if(input==3) {
            if(stuNum!=0) {
               boolean numCheck=false;
               while(!numCheck) {
                  System.out.print("수정할 학생의 학번을 입력하세요 > ");
                  try {
                     input=Integer.parseInt(sc.nextLine());
                  }catch(NumberFormatException e){
                     System.out.println("숫자만 입력 가능합니다");
                     continue;
                  }
                  if(!NumCheck(input,0,stuNum)) continue;
                  else {
                     String msg="";
                     for(int i=0; i<sub.length; i++) {
                        msg+=sub[i]+": " + (i+1) +"  ";
                     }
                     System.out.println(msg);
                     boolean numCheck2=false;
                     while(!numCheck2) {
                        System.out.print("수정할 과목을 선택하세요 > ");
                        int inputSub=0;
                        try {
                           inputSub=Integer.parseInt(sc.nextLine());
                        }catch(NumberFormatException e){
                           System.out.println("숫자만 입력 가능합니다");
                           continue;
                        }
                        if(!NumCheck(inputSub,0,sub.length)) continue;
                        else {
                           int changeScore=0;
                           System.out.println("수정전 " + stuName[input-1] +"의 " + sub[inputSub-1] + "점수는 > " + stuList[input-1][inputSub-1]);
                           System.out.print("변경할 점수를 입력하세요 > ");
                           changeScore=Integer.parseInt(sc.nextLine());
                           stuList[input-1][inputSub-1]=changeScore;
                           System.out.println("변경이 완료되었습니다!!!");
                           System.out.println("------------------------");
                           break;
                        }
                     }
                     break;
                  }
               }
            }else {
               System.out.println("입력된 학생 데이터가 없습니다");
               continue;
            }
         }else if(input==4) {
            if(stuNum!=0) {
               boolean numCheck=false;
               while(!numCheck) {
                  System.out.print("삭제할 학생의 학번을 입력하세요 > ");
                  try {
                     input=Integer.parseInt(sc.nextLine());
                  }catch(NumberFormatException e){
                     System.out.println("숫자만 입력 가능합니다");
                     continue;
                  }
                  if(!NumCheck(input,0,stuNum)) continue;
                  else {
                     String[] resultName=new String[stuNum-1];
                     int[][] resultStuList=new int[stuNum-1][];
                     
                     for(int i=0; i<input-1; i++) {
                    	 resultName[i]=stuName[i];
                     }
                     for(int i=input-1; i<stuName.length-1; i++) {
                    	 resultName[i]=stuName[i+1];
                     }
                     
                     for(int i=0; i<input-1; i++) {
                    	 resultStuList[i]=stuList[i];
                     }
                     
                     for(int i=input-1; i<stuList.length-1; i++) {
                    	 resultStuList[i]=stuList[i+1];
                     }
                     
                     stuName=resultName;
                     stuList=resultStuList;
                     stuNum--;
                     System.out.println("해당 학생의 데이터를 삭제하였습니다");
                     System.out.println("-----------------------------------");
                     break;
                  }
               }
            }else {
               System.out.println("입력된 학생 데이터가 없습니다");
               continue;
            }
            
         }else {
            System.out.println("잘못된 입력입니다");
            continue;
         }
      
      }
   }
   
   public static boolean NumCheck(int inputData, int min, int max) {
      if(inputData<min || inputData>max) {
         System.out.println("범위는 " + (min+1) + "에서" + (max) +"까지 입니다");
         return false;
      }
      else return true;
   }

}