package com.bit.day08;

import java.util.Arrays;



public class Texst04 {

	public static void main(String[] args) {
		
		int limit=45;
		Ball[] box=new Ball[limit];
		String[] note=new String[6];
		
		for(int i=0; i<box.length; i++) {//공 객체 45개 찍기 //체크 안되어져있는 상태
			box[i]=new Ball(i+1);
		}
		
		for(int i=0; i<6; i++) {
			int ran=(int)(Math.random()*limit);
			Ball ball=box[ran];
			if(ball.check) {//뽑은 공이라면
				i--;//다시 뽑기
			}else {//안뽑은공
				ball.check=true;//이제 뽑았으니까 체크
				note[i]=ball.color+"색 공" + ball.su;
			}
		}
		
		/*
		for(int i=0; i<6; i++) {
			for(int j=i+1; j<6; j++) {
				if(note[i] > note[j]) {
					int temp=note[j];
					note[j]=note[i];
					note[i]=temp;
				}
			}
		}
		*/
		
		System.out.println(Arrays.toString(note));
	}
	
	static class Ball{
		//static int num=0;
		
//		public Ball() {
//		num++;
//		this.su=num;
//	}
		final int su;
		boolean check;
		String color;		
		
		public Ball(int su) {
			this.su=su;
			check=false;
			switch(su/10){
			case 0:
				color="노랑";
				break;
			case 1:
				color="파랑";
				break;
			case 2:
				color="빨강";
				break;
			case 3:
				color="초록";
				break;
			default:
				color="회";
				break;
				
			}
		}
	}
}
