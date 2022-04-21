package co.bit.day12;

import java.io.*;

public class Ex05 {

	public static void main(String[] args) {
		File file=new File("test01.txt");
		File copy=new File("test02.txt");
		FileReader fr=null;
		BufferedReader br=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		try {
			fr=new FileReader(file);
			fw=new FileWriter(copy);
			br=new BufferedReader(fr);
			bw=new BufferedWriter(fw);
			int su=-1;
			while((su=br.read())!=-1) {
				System.out.print((char)su);
				bw.write((char)su);
			}
			bw.close();
			br.close();
			fw.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
