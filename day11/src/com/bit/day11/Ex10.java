package com.bit.day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10 {

	public static void main(String[] args) throws IOException{
		File origin=new File("C:\\Users\\BIT\\javawork\\day11\\phoot.jpg");
		File copy=new File("copy.txt");
		if(!copy.exists()) copy.createNewFile();
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		fis=new FileInputStream(origin);
		fos=new FileOutputStream(copy);
		
		for(long su=0; su<origin.length(); su++) {
			fos.write(fis.read());
		}

		fis.close();
		fos.close();

	}

}
