package com.bit.day08;

import java.util.Random;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// 로또 번호생성기(ver 0.1.0)
		// 4,44,23,33,12,2
		// 2,4,12,23,33,44 + 보너스번호
		///////////////////////////////
		// Arrays.sort()사용 x
		///////////////////////////////
		//1.전형적인 방법
		//2.객체지향적으로 구현
		//3.아이디어 이용
		///////////////////////////////
		//공을 뽑았을 때 체크
		//만약 뽑은 공이 체크가 되어져있다면? -> 다시 뽑기
		
		System.out.println("로또 번호 생성기(ver 0.1.0)");
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			boolean bonusTf=true;
			String input;
			System.out.println("로또 번호를 생성하시겠습니까?");
			System.out.print("1. 수동생성   2.자동생성   3.종료 >");
			input=sc.nextLine();
			String number="";
			if(input.equals("1")) {
				String[] numArr=new String[] {};
				System.out.println("1부터 45까지의 번호 5개를 입력하십시오");
				number=sc.nextLine();
				numArr=number.split(",");
				if(numArr.length != 5) {
					System.out.println("숫자를 5개 까지 입력하십시오");
					bonusTf=false;
					continue;
				}else {
					for(int i=0; i<5; i++) {
						for(int j=i+1; j<5; j++) {
							if(i!=j && numArr[i].equals(numArr[j])) {
								System.out.println("중복된 숫자를 입력하셨습니다");
								bonusTf=false;
								continue;
							}
						}
					}
				}
				boolean numTf=true;
				for(int i=0; i<5; i++){
					if(Integer.parseInt(numArr[i]) <= 0 || Integer.parseInt(numArr[i]) > 45) numTf=false;
				}
				if(numTf==false){
					System.out.println("범위는 1~45입니다");
					continue;
				}
				String showNum="";
				for(int i=0; i<5; i++) {
					if(i==4) {
						showNum+=numArr[i];
					}else {
						showNum+=numArr[i] +", ";
					}
				}
				System.out.println(showNum);
				while(bonusTf) {
					String bonusNumber;
					System.out.print("보너스 번호를 입력하십시오 >");
					bonusNumber=sc.nextLine();
					if(Integer.parseInt(bonusNumber) <= 0 || Integer.parseInt(bonusNumber) > 45) {
						System.out.println("범위는 1~45입니다");
					}else {
						boolean bonusTf2=true;
						for(int i=0; i<5; i++) {
							if(bonusNumber.equals(numArr[i])) 	bonusTf2=false;
						}
						if(bonusTf2==false) {
							System.out.println("보너스 번호를 중복된 숫자로 입력하였습니다. 다시 입력하십시오");
						}else {
							showNum+=" 보너스 번호 : "+bonusNumber;
							System.out.println(showNum);
							break;
						}
					}
				}			
				
			}
//			else if(input.equals("2")) {
//				boolean numTf=true;
//				int[] numArr=new int[6];
//				Random rd = new Random();
//				numArr[0] =rd.nextInt(45);
//				int count=1;
//				System.out.println("1부터 45까지의 번호 6개를 자동으로 생성합니다");
//				
//				while(numTf) {
//					int a=rd.nextInt(45);
//					if(a!=numArr[count]) {
//						numArr[count]=a;
//						count++;
//					}		
//					if(numArr.length ==6) numTf=false;
//				}
//				
//				System.out.print("생성된 숫자 : ");
//				for(int i=0; i<6; i++) {
//					System.out.print(numArr[i] + " ");
//				}
//					
//			}
			else if(input.equals("3")) {
				System.out.println("종료합니다");
				sc.close();
				break;
			}else {
				System.out.println("올바른 입력이 아닙니다");
			}
		}
	}

}
