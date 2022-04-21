package co.bit.day12;

import java.io.*;

public class Ex10 {

	public static void main(String[] args) {
		File file=new File("test04.txt");
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		try {
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			pw=new PrintWriter(bw);
			
			pw.println("첫번째 줄");
			pw.println("두번째 줄 내용");
			pw.println("세번째 줄 내용");
			
			pw.close();
			bw.close();
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
