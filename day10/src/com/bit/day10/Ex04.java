package com.bit.day10;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

class Ball implements java.lang.Comparable<Ball>{//TreeSet에 들어가기 위해서는 Comparable을 상속받아야한다
	int su;
	
	//랜덤예제
	static int num=1;
	int num2;
	public Ball(int su) {
		this.su=su;
		num2=num++;
	}
	
//	public Ball(int su) {
//		this.su=su;
//	}
	
	@Override
	public int compareTo(Ball ball) {
		//return this.su-((Ball)obj).su; //new Ball()을 통해서 생성할 때
		//su의 값이 같으면 같은 객체로 취급하여 size를 1로 반환
		//su의 값이 다르면 다른 객체로 취급하여 size를 2로 반환
		//return ((Ball)obj).su-this.su; //위의 식과 부호가 반대 따라서 내림차순으로 정렬됨
		//return 1;
		return this.su-ball.su;
		//ㄴ> 위의 Comparable에 제네릭 Ball을 붙힘으로써 compareTo의 오버라이드당시
		//Ball ball을 받게 되며
		//return 당시에도 캐스팅 없이 this.su-ball.su로 바로 가능하다
	}
}

public class Ex04 {

	public static void main(String[] args) {
		/*
		//return this.su-((Ball)obj).su; 일경우 
		Set lotto=new TreeSet();
		Random ran=new Random();
		
		while(lotto.size() != 6) {
			lotto.add(new Ball(ran.nextInt(45)+1));//TreeSet으로 돌리면 에러남 HashSet은 안남
		}
		Iterator ite=lotto.iterator();
		while(ite.hasNext()) {
			Ball ball=(Ball)ite.next();
			System.out.print(ball.su + " ");
			
		}
		
		*/
		
		//오름차순 내림차순 결정
		Comparator<Ball> comp=new Comparator<Ball>() {//String과 같은 클래스 속 compareTo의 코드를 바꿀 수 없기 때문에 작성을 통해 compare를 만든다
			@Override
			public int compare(Ball after, Ball before) {//둘다 적혀 있다면 위의 compareTo보다 compare이 우선 순위가 더 높음
				return after.su-before.su;
				// 양수면 오름차순
				// 음수면 내림차순
				//return 1 혹은 return -1은 오름차순 내림차순 정렬이 아닌 객체생성 순서 기준 정순 혹은 역순이라는 표현
				//return -1;
			}
		};

		Set lotto=new TreeSet(comp);//TreeSet에 comp를 넣어서 작동하기 때문에
		//comp가 오름차순, 내림차순 결정
		Random ran=new Random();
		int su=1;
		
		while(lotto.size() != 6) {
			lotto.add(new Ball(ran.nextInt(6)+1));//TreeSet으로 돌리면 에러남 HashSet은 안남
		}
		Iterator ite=lotto.iterator();
		while(ite.hasNext()) {
			Ball ball=(Ball)ite.next();
			System.out.print(ball.su + " ");
			System.out.println(ball.num2 + " ");
			
		}
	}
	
}
