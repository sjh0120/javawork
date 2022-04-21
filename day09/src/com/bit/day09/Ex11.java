package com.bit.day09;

import java.util.StringTokenizer;

public class Ex11 {

	public static void main(String[] args) {
		//String msg="java web db spring";
		String msg="java web       db spring";
		//공백이 많다면? -> 4개로 나뉘는게 아니라 중간에 스페이스바까지 나뉨
		//하지만 StringTokenizer는 비어있는것을 다 무시하고 나눈다!
		String[] arr1=msg.split(" ");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(i+":" + arr1[i]);
		}
		
		/*참고!
		String msg="java,web, ,db,spring";
		String[] arr1=msg.split(",");
		로 코드를 작성하면 java/web/ /db/spring으로 나뉘지만
		StringTokenizer의 경우는 java/web/db/spring으로 스페이스바를 무시한다!
		 */
		
		System.out.println("--------------------");
		StringTokenizer token=null;
//		token=new StringTokenizer(msg,","); 
		token=new StringTokenizer(msg); 
		//","를 안줘도 디폴트로 " "를 기준으로 나눈다!
		while(token.hasMoreElements()) {
			System.out.println(token.nextElement());
		}
		
		//split은 개요로 받지만, StringTokenizer는 vector를 활용한다!
		//vector의 명령어인 hasMoreElements 와 nextElement를 씀
		//하지만 hasMoreTokens와 nextToken또한 가능하다!

//		while(token.hasMoreTokens()) {
//			System.out.println(token.nextToken());
//		}
		
	}

}
