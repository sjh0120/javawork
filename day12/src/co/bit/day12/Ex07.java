package co.bit.day12;

import java.io.*;

public class Ex07 {

	public static void main(String[] args) {
		File file=new File("test04.txt");
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		try {
			if(!file.exists())file.createNewFile();
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			
			
			/*
			fw.write("첫째줄");
			fw.write("\r\n");//윈도우의 개행 방식은 \r\n이다!
			fw.write("둘째줄");
			fw.write("\r\n");
			fw.write("셋째줄");
			*/
			
			bw.write("첫째줄");
			bw.newLine();
			bw.write("둘째줄");
			bw.newLine();
			bw.write("셋째줄");
			
			/*
			개행을 할 때 os에 따라
			윈도우라면 -> \r\n
			아니라면 -> \n
			을 해야하는데
			버프를 사용하면 bw.newLine()을 통해 os영향을 안받고
			개행을 사용 할 수 있다.
			 */
			
			bw.close();
			fw.close();
			} catch (IOException e) {
			e.printStackTrace();
		}

	}

}