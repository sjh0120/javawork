package com.bit.day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		File file=new File("test08.txt");
		FileInputStream fis = null;
		byte[] arr=new byte[(int)file.length()];
		if(file.exists()) {
			try {
				fis=new FileInputStream(file);
//				for(int i=0; i<file.length(); i++) {
//					arr[i]=(byte)fis.read();
//					//file.length()보다 더 크게해서 할 순 있음
//					//이때 값이 더 없으면 -1로 채워짐
//				}
//				System.out.println((byte)fis.read());
//				System.out.println((byte)fis.read());
//				System.out.println((byte)fis.read());
				
				while(true) {
					int su=fis.read();
					if(su==-1)break;
					System.out.print(su);;
				}
				
//				System.out.println(new String(arr));
//				System.out.println(fis.read());
				
				fis.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
