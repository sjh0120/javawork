package co.bit.day12;

import java.io.*;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		InputStream is=System.in;
		System.out.println(is.read()=='a');
		System.out.println(is.read()=='\r');
		System.out.println(is.read()=='\n');
		
		
		
		/*
		File file = new File("test05.txt");
		try {
			if(!file.exists())file.createNewFile();
			Scanner sc=new Scanner(new File("test05.txt"));
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.next());
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 */
	}

}
