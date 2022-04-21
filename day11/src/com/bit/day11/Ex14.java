package com.bit.day11;

import java.io.*;
import java.util.Arrays;

public class Ex14 {

	public static void main(String[] args) {
		File file=new File("test2.txt");
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		long before, after;
		byte[] buf=new byte[1024];
		byte[] arr=new byte[(int)file.length()];
		int cnt=0;
		try {
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis);
			before=System.currentTimeMillis();
			while(true) {
				int su=bis.read(buf);
				if(su==-1) break;
				//arr[cnt++]=(byte)su;
				System.out.println(new String(buf,0,su));
				
			}
			bis.close();
			fis.close();
			after=System.currentTimeMillis();
			System.out.println(Arrays.toString(arr) + ":" + (after-before)+"ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 - 기존
		기존의 보조기억장치 -> 버퍼클래스 생성 후 -> 버퍼 사이즈를 통한 IO의 경우
		버퍼 사이즈를 통해 반복문 (1개씩 읽는 것에 비해 여러개를 읽게되면 반복의 횟수를 줄임) 횟수를 감소시킴
		이를 통해 속도를 향상시킴
		
		 - 필터클래스
		 필터클래스를 통해 사용과 동시에 보조기억장치에 있던 정보를
		 버퍼(메모리)에 이미 저장함 => 즉 기존은 보조기억장치와 IO(메모리) 의 처리 속도라면
		 => 필터클래스는 메모리와 IO(메모리)간의 처리
		 => 처리속도에 엄청난 차이가 있다!
		 ==> 필터클래스의 경우 보조기억장치에 있는 정보를 버퍼에 바로 저장하기 때문에
		 ==> 버퍼와 보조기억장치의 매치를 잘못해버리면 버퍼속 데이터 출력과 동시에
		 ==> 주기억장치의 정보를 손실해버림! 따라서 주의해서 작성해야함
			
		 */
	}

}
