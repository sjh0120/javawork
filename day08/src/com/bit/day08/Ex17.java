package com.bit.day08;

//학생성적관리프로그램(ver 0.3.0)
// 1.입력 2.보기 [3.수정 4.삭제] 0종료>
// 학번 국어 영어 수학
// -------------------
// 입력에 제한이 없도록 제작하시오(학생수의 제한없이)
// 배열을 사용하시오
// 컬렉션 프레임워크 금지
import java.util.Arrays;

public class Ex17 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("학생 성적관리 프로그램(ver 0.3.0");
		System.out.println("----------------------------");
		//String[][] student=new String[][]{};
		String[] student=new String[] {};
		String score="";
		
		int num=0;
		while(true) {
			System.out.print("1. 입력 2. 결과 3. 수정  4. 삭제   0. 종료>");
			String input = sc.nextLine();
			
			if(input.equals("0")) {
				sc.close(); break;
			}
			else if(input.equals("1")) {
				
				System.out.print("학생의 학번 >");
				score+=sc.nextLine();
				System.out.print("학생의 국어점수 >");
				score+=sc.nextLine();
				System.out.print("학생의 영어점수 >");
				score+=sc.nextLine();
				System.out.print("학생의 수학점수 >");
				score+=sc.nextLine();
				//student[num]=score[0];
				num++;
				
			}else if(input.equals("2")) {
				System.out.println("----------------------------");
				System.out.println("학번  |국어   |영어   |수학  ");
				//String table="";
				System.out.println(score);
				for(int i=0; i<num; i++) {
					//table="\n" + student[i][0] + "   " + student[i][1] + "   " + student[i][2] + "   " + student[i][3];
				}
				//System.out.print(table);
				System.out.println("----------------------------");
			}else if(input.equals("3")){
				System.out.println("----------------------------");
				System.out.println("3번");
				System.out.println("----------------------------");
			}else if(input.equals("4")){
				System.out.println("----------------------------");
				System.out.println("4번");
				System.out.println("----------------------------");
			}else {
				System.out.println("메뉴를 확인하시고 다시 입력바랍니다");
			}
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
}
