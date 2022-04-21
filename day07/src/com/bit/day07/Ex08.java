package com.bit.day07;

public class Ex08 {

	public static void main(String[] args) {
		int[] arr1= {1,2,0,4};
		
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);
		
		for(int i=0; i<6; i++) {
			/*
			try {
				try {
					//System.out.println(1.0/arr1[4]); //무한 출력 에러 발생 x
					//System.out.println(1/arr1[4]); //에러 발생 -> 에러 또한 올바른 범위내에서만 발생한다
					System.out.println(1/arr1[i] + ", " + i);
				}catch(java.lang.ArithmeticException e) {
					System.out.println("0으로 나눠서 에러가 발생했습니다");
				}
			}catch(java.lang.ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 범위 초과");
			}
			*/
			//따라서 밑의 방식이 에러처리에 더 좋음
			try {
				System.out.println(1/arr1[i] + ", " + i);
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눠서 에러가 발생했습니다");
				System.out.println(e.toString());
				System.out.println(e.getMessage());
				System.out.println(e.getClass());
				System.out.println(e.getLocalizedMessage());
				e.printStackTrace();//몇번라인에서 에러인지 출력
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 범위 초과");
				System.out.println(e.toString());
			}
			
		}
		//try-catch 작성에 있어 범위를 잘 정해주는것이 중요하다!
	}

	//java.lang.Exception e -> 모든에러 잡음
	//java.lang.ArithmeticException e -> 계산으로 인한 에러 발생시
	//java.lang.ArrayIndexOutOfBoundsException e -> 인덱스 배열 초과
	//catch를 통해 에러를 잡을 때는 제일 바깥범위에 있는 에러부터 잡는 것이 아니라
	//코드 윗줄에있는 에러 코드부터(안쪽범위) 에러를 잡는다
	//일반 에러 -> 런타임에러 -> Exception e
}
