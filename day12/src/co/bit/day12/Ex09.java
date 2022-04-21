package co.bit.day12;

import java.io.*;

public class Ex09 {

	public static void main(String[] args) {
		File file=new File("test04.txt");
		
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
			//직접
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			//bw.newLine();을 통한 개행시
//			//line단위로 받아올 수 있음!
//			System.out.println(br.readLine());
//			//더 이상 없으면 null로 출력!
			
			//반복문
//			while(true) {
//				String msg=br.readLine();
//				if(msg==null)break;
//				System.out.println(msg);
//			}
			
			//코드 압축
			String msg=null;
			while((msg=br.readLine())!=null)
				System.out.println(msg);
						
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
