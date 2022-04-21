package com.bit.javatest;

import java.util.ArrayList;
import java.util.Scanner;

//객체
//배열 미스매치 나면 안좋음
//collection Framwork -> 안됨
//-> 객체를 자료구조에 넣는다
// -> 자료구조를 통해 동적할당, 자료형까지 살릴 수 있음
/*
class Student { //확장성이 뛰어나다
	static int cnt;
	final int num;//학번 -> 변동되지 않도록!
	String name;
	int kor, eng, math;
	
	public Student(String name) {
		num=++cnt;
		//학생을 추가받을때 마다 학생수 +1 -> 학번 또한 할당
		//-> 수정과 삭제에서 Student 객체를 만들지 않겠다는 의미!
		this.name=name;
	}

}
*/

public class StudentScore03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생성적관리 프로그램(ver 0.5.1)");
		ArrayList<Student> data = new ArrayList<>();
		//ArrayList<String> => 처리속도가 좀 더 빠르긴 함
		//그러나 확장성 측면에서 객체를 이용하는 것이 더 좋다
		
		while (true) {
			System.out.print("1.입력 2.보기 3.수정 4.삭제 0.종료 > ");
			int input = Integer.parseInt(sc.nextLine());
			if (input == 0) {
				sc.close();
				break;
			}
			if (input == 1) {
				System.out.print("이름 > ");
				Student stu = new Student(sc.nextLine());
				System.out.print(stu.num + "의 국어 > ");
				stu.kor = Integer.parseInt(sc.nextLine());
				System.out.print(stu.num + "의 영어 > ");
				stu.eng = Integer.parseInt(sc.nextLine());
				System.out.print(stu.num + "의 수학 > ");
				stu.math = Integer.parseInt(sc.nextLine());
				data.add(stu);
			} else if (input == 2) {
				System.out.println("-------------------------------------------------------------");
				System.out.println("학번\t이름\t\t\t국어\t영어\t수학\t평균");
				System.out.println("-------------------------------------------------------------");
				for (int i = 0; i < data.size(); i++) {
					Student stu = data.get(i);
					System.out.println(" " + stu.num + "\t" + stu.name + "\t\t\t" + stu.kor + "\t" + stu.eng + "\t"
							+ stu.math + "\t" + (stu.kor + stu.eng + stu.math) * 100 / 3 / 100.0);
				}
				System.out.println("-------------------------------------------------------------");

			} else if (input == 3) {
				System.out.print("수정할 학생의 학번을 입력하세요 > ");
				int temp = Integer.parseInt(sc.nextLine());
				for (int i = 0; i < data.size(); i++) {
					Student stu = data.get(i);
					if (stu.num == temp) {
						System.out.print("국어 > ");
						stu.kor = Integer.parseInt(sc.nextLine());
						System.out.print("영어 > ");
						stu.eng = Integer.parseInt(sc.nextLine());
						System.out.print("수학 > ");
						stu.math = Integer.parseInt(sc.nextLine());
						System.out.print("수정완료!!!");
					}
				}
			} else if (input == 4) {
				System.out.print("삭제할 학생의 학번을 입력하세요 > ");
				int temp = Integer.parseInt(sc.nextLine());
				for (int i = 0; i < data.size(); i++) {
					Student stu = data.get(i);
					if (stu.num == temp) {
						data.remove(i);
						System.out.print("삭제완료!!!");
					}
				}
			} else {
				System.out.println("잘못된 입력입니다");
				continue;
			}
		}

	}
}
