package co.bit.day12;

import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

public class Ex15 {

	public static void main(String[] args) {
		File file=new File("test06.bin");
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			
			int su=ois.read();
			int su2=ois.readInt();
			ArrayList list=(ArrayList)ois.readObject();
			Vector vec=(Vector)ois.readObject();
			
			ois.close();
			fis.close();
			
			System.out.println(su);
			System.out.println(su2);
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			System.out.println(vec.get(0));
			Vector vec2=(Vector)vec.get(1);
			for(int i=0; i<vec2.size(); i++) {
				System.out.println(vec2.get(i));
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		
	}

}
