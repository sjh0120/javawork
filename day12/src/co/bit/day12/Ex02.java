package co.bit.day12;

import java.io.*;

public class Ex02 {

	public static void main(String[] args) {
		File file=new File("test01.txt");
		FileReader fr=null;
		
		try {
			fr=new FileReader(file);
			
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			//문자열 스트림 -> 메모리 스트림 과 다름!
			/*
			 - 문자열 스트림 
			안의 내용(문자가 몇개인지)을 중요시해야함!
			
			 - 메모리 스트림
			메모리의 양(받아온 문자의 총 메모리가 얼마나 되는지)을 중요시해야함!
			-> 메모리의 토탈과 차이가 발생하면 글자의 깨짐현상이 발생함!
			
			*/
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
