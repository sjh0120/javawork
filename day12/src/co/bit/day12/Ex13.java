package co.bit.day12;

import java.io.*;

public class Ex13 {

	public static void main(String[] args) {
		File file=new File("test03.txt");
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		ByteArrayOutputStream baos=null;
		ByteArrayInputStream bais=null;
		
		try {
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis);
			baos=new ByteArrayOutputStream();
			
			
			int su=-1;
			while((su=bis.read())!=-1) {
				baos.write(su);
			}
			
			System.out.println(new String(baos.toByteArray()));
			bais=new ByteArrayInputStream(baos.toByteArray());
			while(true) {
				int su2=bais.read();
				if(su2==-1)break;
				System.out.println(su2);
			}
			bais.close();
			baos.close();
			bis.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
