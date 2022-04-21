package com.bit.day11;

import java.io.*;

public class Ex11 {

	public static void main(String[] args) {
		String msg="abc";
		for(int i=0; i<1000; i++) {
			msg+=i;
		}
		byte[] buf=msg.getBytes();
		long before,after;
		System.out.println(buf.length);
		File file=new File("test2.txt");
		FileOutputStream fos=null;
		try {
			if(!file.exists())file.createNewFile();
			fos=new FileOutputStream(file);
			before=System.currentTimeMillis();
			
			/*
			//방법 1 -> 직접 for를 통해 입력 => 속도 느림
			for(int i=0; i<buf.length; i++) {
				fos.write(buf[i]);
			}
			*/
			
			/*
			//방법 2 -> buf에 바로 넣음 => 속도 비교적 빠름
			fos.write(buf);
			 */
			fos.write(buf,0,buf.length);
			//바이러스의 예제 ++
			//ㄴ> 우리는 남는 버퍼를 처리하기 위해서
			//ㄴㄴ>fos.write(buf,0,buf.length);로 해야함
			after=System.currentTimeMillis();
			
			fos.close();
			System.out.println("작성완료" + (after-before) + "ms");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			

	}

}
