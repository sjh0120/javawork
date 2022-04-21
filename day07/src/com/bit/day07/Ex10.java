package com.bit.day07;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("호출 전");
		func01();
		System.out.println("호출 후");

	}
	
	public static void func01(){
		try {
			int su=1/0;
			System.out.println("문제없음");
			//return;
		}catch(Exception e) {
			System.out.println("문제있음");
			return;
		}finally {//->리턴을 통해서 함수가 끝나게 되더라도 finally는 꼭 실행한다라는 의미
			System.out.println("항상실행");
		}
	}

}
