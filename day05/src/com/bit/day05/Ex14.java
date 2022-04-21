package com.bit.day05;

public class Ex14 {

	public static void main(String[] args) {
		int[] arr1;
		arr1=new int[]{1,2,3,4};
		
		int[] arr2=new int[]{5,6,7};
		
		int[] arr3=new int[]{8,9};
		
		//int[][] arr4=new int[][] {arr1,arr2,arr3};
		int[][] arr4=new int[4][3]; //=> int형 배열 3짜리 배열 4개가 생성됨
		arr4[0]=arr1; //=>가능은 하나 arr4[0][4]까지 되기 때문에 비효율적임
		//int[3] 배열을 4개를 이미 만들었는데 arr4[0]에 int[3]배열이 만들어져 있음에도 불과하고
		//새로 다른 배열을 넣기 때문에 자원낭비가 발생한다
		
		//int[][] arr4=new int[4][2]; => int배열 4개를 가질수 있는 배열
		//즉
		//int[][] arr4=new int[4][] 는
		//int[][] arr4=new int[][]{null, null, null, null}이라는 의미
		
		//arr4[1][2]=70;
		
		for(int i=0; i<arr4.length; i++) {
			/*
			int[] temp=arr4[i];
			for(int j=0; j<temp.length; j++) {
				System.out.print(temp[j]+"\t");
			}
			*/
			for(int j=0; j<arr4[i].length; j++) {
				System.out.print(arr4[i][j] +"\t");
			}
			System.out.println();
			/*
			int[][] arr4=new int[3][2];를 통한
			System.out.print(arr4[i][j] +"\t");출력시에는
			인트형 배열의 2중 배열 안에서도 초기화가 되었기 
			때문에 0으로 출력된다!
			*/
			
			//System.out.println(arr4[i]); //=>null 3번 출력
			/*
			 int[][] arr4=new int[3][];를 통한
			 System.out.println(arr4[i]);
			 출력시에는 arr4가 인트형 배열로 이루어진 배열이기 때문에
			 전역변수의 기본값은 null 따라서 null이 출력된다.
			 */
			
		}
	}

}
