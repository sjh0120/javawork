package com.bit.day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) {
		File file=new File("test1.txt");
		long before, after;
		
		FileInputStream fis=null;
		byte[] buf=new byte[2];
		
		try {
			fis=new FileInputStream(file);
			before=System.currentTimeMillis();
			
			/*
			//1바이트씩 읽어들이는 경우 -> 느림
//			while(true) {
//				int su=fis.read();
//				if(su==-1) break;
//			}	
			 */
			
			/*
			//byte[] buf의 배열 크기에 따라 성능이 달라지며,
			//이전에 1바이트씩 읽어들이고 쓰는것에 비해 buf의 크기만큼 읽어오기 때문에
			//더욱 빨라짐
//			while(true) {
//				int su=fis.read(buf);
//				if(su==-1)break;
//			}
			 */
			
			while(true) {
				int su=fis.read(buf);
				if(su==-1) break;
				System.out.println(new String(buf,0,su));
				//System.out.println(new String(buf));
				//ㄴ> 하게되면 7바이트 짜리를 2바이트로 쪼개서 불러올 때 6바이트의 값이 8번째 차례에 중복해서 들어오게됨
				//ㄴㄴ> 바이러스의 원리 (즉 8번째에 있는 중복되어져 있는 값이 있어서는 안되는 값인데 존재해서 추가적인 용량(메모리)을 차지
				//ㄴㄴㄴ>System.out.println(new String(buf,0,su));를 통해 su만큼 다 받고나서 나머지를 없애버린다.
			}
			
			fis.close();

			after=System.currentTimeMillis();
			System.out.println(":" + (after-before) + "ms");
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			
		}
		
	}

}
