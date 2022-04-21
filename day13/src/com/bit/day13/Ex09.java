package com.bit.day13;

import java.io.*;

public class Ex09 {

	public static void main(String[] args) {
		File file=new File("test09.txt");
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		OutputStreamWriter osw=null;
		try {
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos);
			osw=new OutputStreamWriter(bos);
			
			osw.write("문자열 잘 작성됩니다....");
			
			osw.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
