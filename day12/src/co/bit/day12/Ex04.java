package co.bit.day12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		File file=new File("test01.txt");
		File copy=new File("test02.txt");
		FileReader fr=null;
		FileWriter fw=null;
		char[] cbuf=new char[5];
		try {
			if(!copy.exists()) copy.createNewFile();
			fw=new FileWriter(copy);
			fr=new FileReader(file);
			while(true) {
				int su=fr.read(cbuf,0,2); //cbuf의 크기가 5이더라도 2칸까지만 사용
				if(su==-1) break;
				System.out.println(Arrays.toString(cbuf));
				fw.write(cbuf,0,su);
			}
			fr.close();
			fw.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
