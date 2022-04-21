package com.bit.javatest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//map 사용

public class StudentScore04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생성적관리 프로그램(ver 0.5.1)");
		String[] title = { "학번", "이름", "국어", "영어", "수학" };

		ArrayList<HashMap<String, String>> data = new ArrayList<>();
		//title에 음악이 없지만 출력에서 음악을 출력하도록 하면 null 값이 나옴
		//ㄴ> 학생에 대한 과목별 점수가 다 안들어가도 문제가 되지 않음
		//ㄴㄴ> 기존에 하던 자료구조는 크기가 정해져 있음! 그러나 map은 마음대로 변동할 수 있음! 또한 에러도 없음
		//-> map의 장점! => 크기가 정해져 있지 않아도 에러가 발생안하고, 마음대로 조절할 수 있다.
		//=> 이는 빅데이터의 비정형데이터에 좋음!
		
		// => 기존의 객체를 사용하는 경우 자료형을 살릴 수 있음
		// => 그러나 map은 자료형을 유지할 수 없기 때문(value의 값을 유지하고자 하는 값으로 고정해야만 함)에
		//	   캐스팅 해줘야만 함!
		
		int num = 0;
		while (true) {
			System.out.print("1.입력 2.보기 3.수정 4.삭제 0.종료 > ");
			int input = Integer.parseInt(sc.nextLine());
			if (input == 0) {
				sc.close();
				break;
			}
			if (input == 1) {
				num++;
				HashMap<String, String> map = new HashMap<>();
				;
				map.put(title[0], num + "");
				for (int i = 1; i < title.length; i++) {
					System.out.print(title[i] + " > ");
					map.put(title[i], sc.nextLine());
				}
				data.add(map);
			} else if (input == 2) {
				System.out.println("------------------------------------------------------");
				System.out.println(title[0] + "\t" + title[1] + "\t\t\t" + title[2] + "\t" + title[3] + "\t" + title[4]);
				System.out.println("------------------------------------------------------");
				for(int i=0; i<data.size(); i++) {
					HashMap<String, String>map=data.get(i);
					System.out.println(
							map.get(title[0]) + "\t" + map.get(title[1]) + "\t\t\t"
							+ map.get(title[2]) + "\t" + map.get(title[3]) + "\t"
							+ map.get(title[4])
							);
				}
				
				System.out.println("------------------------------------------------------");
			} else if (input == 3) {

			} else if (input == 4) {

			} else {
				System.out.println("잘못된 입력입니다");
				continue;
			}
		}

	}

}
