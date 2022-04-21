package co.bit.day12;

import java.io.*;

public class Ex03 {

	public static void main(String[] args) {
		File file=new File("test01.txt");
		FileInputStream fis=null;
		
		//한번에 15바이트를 받아서 변환한다
		//byte[] buf=new byte[15];
		//ㄴ> 스페이스바 까지 총 16바이트라서 마지막 글자 깨짐
		byte[] buf=new byte[16];
		//ㄴ> 안깨짐
		
		try {
			fis=new FileInputStream(file);
			
			for(int i=0; i<buf.length; i++) {
				buf[i]=(byte)fis.read();
			}
			
			/*3바이트씩 5번
			byte[] han= new byte[3];

			han[0]=(byte) fis.read();
			han[1]=(byte) fis.read();
			han[2]=(byte) fis.read();
			System.out.println(new String(han));
			*/
			
//			han= new byte[3];
//
//			han[0]=(byte) fis.read();
//			han[1]=(byte) fis.read();
//			han[2]=(byte) fis.read();
//			System.out.println(new String(han));
//			
//			han= new byte[3];
//
//			han[0]=(byte) fis.read();
//			han[1]=(byte) fis.read();
//			han[2]=(byte) fis.read();
//			System.out.println(new String(han));
//			
//			han= new byte[3];//띄어쓰기 칸
//			//띄어쓰기는 1바이트 따라서 나머지 2바이트에는 라의 2바이트가 들어와서 글자가 깨지게됨
//			//ㄴ> 모든 문자열을 다 받고, 글자별 바이트 변환이 아닌
//			//ㄴㄴ> 일괄적으로 한번에 다 변환을 해야한다!
//			
//			han[0]=(byte) fis.read();
//			han[1]=(byte) fis.read();
//			han[2]=(byte) fis.read();
//			System.out.println(new String(han));
//			
//			han= new byte[3];
//
//			han[0]=(byte) fis.read();
//			han[1]=(byte) fis.read();
//			han[2]=(byte) fis.read();
//			System.out.println(new String(han));
			
			fis.close();
			System.out.println(new String(buf));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
