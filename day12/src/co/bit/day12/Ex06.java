package co.bit.day12;

import java.io.*;

public class Ex06 {

	public static void main(String[] args) {
		File file = new File("test03.txt");
		FileWriter fw=null;

		try {
			if(!file.exists())file.createNewFile();
			fw=new FileWriter(file);
			
			fw.write("문자열을 문자열스트림을 통해 바로 작성");
			fw.write("\n");
			fw.write("다음줄 작성");
			fw.write("\n");
			fw.write("또 다음줄 작성");
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
