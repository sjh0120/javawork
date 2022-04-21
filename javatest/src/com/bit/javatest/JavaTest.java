package com.bit.javatest;

import java.util.Scanner;
/*
class Student{
	private Object[] arr=new Object[0];
	
	public void add(Object stuData) {
		Object[] before=arr;
		arr=new Object[arr.length+1];
		System.arraycopy(before, 0, arr, 0, before.length);
		arr[arr.length-1]=stuData;		
	}
	
	public int size() {
		return arr.length;
	}
	
	public Object get(int idx) {
		return arr[idx];
	}
	
	public void set(int idx, Object obj) {
		arr[idx]=obj;
	}
	
	public void remove(int idx) {
		Object[] before=arr;
		arr=new Object[arr.length-1];
		for(int i=0; i<idx; i++) {
			arr[i]=before[i];
		}
		for(int i=idx; i<arr.length; i++) {
			arr[i]=before[i+1];
		}
	}
}

public class JavaTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String title="학생성적관리 프로그램(ver 0.4.0)";
		System.out.println(title);
		int input=0;
		int maxStu=30;
		
		Student stuList=new Student();
		String[] msg= {"기초문법","백엔드","프런트엔드"};
		
		while(true) {
			try {
				System.out.print("1.성적입력 2.성적출력 3.성적수정 4.삭제 0.종료>");
				input=Integer.parseInt(sc.nextLine());
			}catch(java.lang.NumberFormatException e) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			if(input==0) {
				break;
			}else if(input==1) {
				if(stuList.size()<maxStu) {
					int[] stu=new int[msg.length];		
					for(int i=0; i<msg.length; i++) {
						scoreIn(msg[i], i, sc, stu);
					}
					stuList.add(stu);
					System.out.println("--------------------------------------------------------------");	
				}else {
					System.out.println("학생 수는 30명을 초과할 수 없습니다.");
					System.out.println("학생 데이터를 비워주세요");
					continue;
				}
				
			}else if(input==2) {
				System.out.println("--------------------------------------------------------------");
				System.out.println("학번\t기초문법\t백엔드\t\t프런트엔드\t평균");
				System.out.println("--------------------------------------------------------------");
				for(int i=0; i<stuList.size(); i++) {
					int sum=0;
					int[] stu=(int[])stuList.get(i);
					for(int j=0; j<stu.length; j++) sum+=stu[j];
					int avg=(int) ((sum/(double)stu.length)*100);
					System.out.println(" "+(i+1)+"\t" + stu[0]+"\t\t" + stu[1]+"\t\t" + stu[2] + "\t\t" + avg/100.0);
				}
				System.out.println("--------------------------------------------------------------");	
			}else if(input==3) {
				int sub;
				int afterScore;
				if(stuList.size() >0) {
					try {
						System.out.print("수정할 학생의 학번을 입력하세요 > ");
						input=Integer.parseInt(sc.nextLine());	
					}catch(java.lang.NumberFormatException e) {
						System.out.println("잘못된 입력입니다");
						continue;
					}
					if(input<maxStu) {
						if(input <= stuList.size() && input>=1) {
							System.out.println("--------------------------------------------------------------");	
							System.out.println("기초문법> 1  백엔드> 2  프런트엔드> 3");
							System.out.print("변경할 과목을 입력하세요 > ");
							sub=Integer.parseInt(sc.nextLine());
							if(sub <= 0 || sub > msg.length) {
								System.out.println("과목번호는 1~3입니다");
								continue;
							}else {
								int[] scoreArr = (int[])(stuList.get(sub-1));
								System.out.println("변경 전 점수 > " + scoreArr[sub-1]);
								System.out.print("변경 후 점수 > ");
								afterScore=sc.nextInt();
								if(afterScore >=0 && afterScore<100) {
									scoreArr[sub-1]=afterScore;
									stuList.set(input-1, scoreArr);
									System.out.println("변경에 성공하였습니다");
									System.out.println("--------------------------------------------------------------");	
								}else {
									System.out.println("점수는 0~100사이입니다");
								}
							}
						}else {
							System.out.println("해당하는 학생이 없습니다");
						}
					}else {
						System.out.println("최대 학생수는 " + maxStu+"입니다");
					}
				}else System.out.println("입력된 학생이 없습니다");
			}else if(input==4) {
				if(stuList.size() >0) {
					try {
						System.out.print("삭제할 학생의 학번을 입력하세요 > ");
						input=Integer.parseInt(sc.nextLine());
						if(input<maxStu) {
							if(input <= stuList.size() && input>=1) {
								stuList.remove(input-1);
								System.out.println("해당하는 학생데이터를 삭제하였습니다");
								System.out.println("--------------------------------------------------------------");	
							}else {
								System.out.println("해당하는 학생이 없습니다");
							}
						}else {
							System.out.println("최대 학생수는 " + maxStu+"입니다");
						}
					}catch(java.lang.NumberFormatException e) {
						System.out.println("숫자로 입력하십시오");
						continue;
					}
				}else System.out.println("입력된 학생이 없습니다");
			}else {
				System.out.println("올바른 숫자를 입력하세요");
				continue;
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}

	public static void scoreIn(String msg, int i, Scanner sc, int[] stu) {
		int input=0;
		while(true) {
			System.out.print(msg+">");
			try {
				input=Integer.parseInt(sc.nextLine());
			}catch(java.lang.NumberFormatException e) {
				System.out.println("숫자로 입력하십시오");
				continue;
			}
			if(input<=100&&input>=0) break;
			else {
				System.out.println("점수는 0~100점 사이입니다");
			}
		}	
		stu[i]=input;
	}
}
*/
