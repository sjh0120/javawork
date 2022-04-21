package co.bit.day12;

import java.io.*;

public class Ex12 {

	public static void main(String[] args) {
		File file=new File("test05.bin");
		FileInputStream fis=null;
		DataInputStream dis=null;
		
		try {
			fis=new FileInputStream(file);
			dis=new DataInputStream(fis);
			
			System.out.println(dis.read());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
			dis.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
