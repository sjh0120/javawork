package com.bit.day11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex08 {

	public static void main(String[] args) {
		File file=new File("test08.txt");
		try {
			if(file.exists()) file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//바이트 스트림
		//기본 단위 : 1byte
		//InputStream : 읽음
		//OutputStream : 쓰기
		String msg="가나다라마바\n12345\nabcdefg\n!@#$";
		byte[] arr=msg.getBytes();
		System.out.println(Arrays.toString(arr));
		java.io.FileOutputStream fos=null;
		
		try {
			fos=new FileOutputStream(file);
			//fos.write(arr);	//매번 1byte씩 작성
//			fos.write(-22);
//			fos.write(-80);
//			fos.write(-128);
			for(int i=0; i<arr.length; i++) {
				fos.write(arr[i]);
			}
			System.out.println("작성완료");
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	/*
	
	인코딩(디코딩) vs 폰트
	 * 인코딩(디코딩)
	자료의 데이터를 인코딩 혹은 디코딩하는 방식에 맞춰서 자료를 변형시킴
	
	 * 폰트
	자료의 데이터 변경 없이 출력하는 방식(출력하는 그림체)을 변형시키는 개념
	
	=> 자료의 데이터 변경 유무가 엄청난 차이점
	

	 */

}
