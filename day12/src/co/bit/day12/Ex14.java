package co.bit.day12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;

public class Ex14 {

	public static void main(String[] args) {
		File file=new File("test06.bin");
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			
			oos.write(-127);
			oos.writeInt(1234);
			//data스트림과 중복
			ArrayList list=new ArrayList();
			list.add(1111);
			list.add(2222);
			list.add(3333);
			oos.writeObject(list);
			
			Vector vec=new Vector();
			vec.add("잘 들어감");
			Vector vec2=new Vector();
			vec2.add(3.14);
			vec.add(vec2);
			oos.writeObject(vec);
			
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
