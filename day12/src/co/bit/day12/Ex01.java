package co.bit.day12;

import java.io.*;

public class Ex01 {
	//문자열 스트림(2byte)
	public static void main(String[] args) {
		File file=new File("test01.txt");
		FileWriter fw=null;
		try {
			if(!file.exists())file.createNewFile();
			fw=new FileWriter(file);
			
			//char ch='a'; ch=97;과 같은 개념이라고 생각하기
			fw.write((int)'가');//int로 캐스팅 해두면 char로 오토캐스팅 되기때문에 붙여둠
			//바이트스트림 -> 1칸(8bit)씩 전달
			//문자열스트림 -> 2칸(16bit)씩 전달
			//그런데 어제의 '가' 와같은 글자는 3바이트로 저장된다
			//그렇다면 문자열은 3칸씩 전달해야하지 않나?
			//ㄴ> 3바이트로 된 문자를 2바이트로 인코딩(?) 후 통신
			//ㄴ-> 2바이트로 받은 문자를 디코딩(?) 후 3바이트 글자로 전환
			fw.write('나');
			fw.write('다');
			fw.write(' ');//띄어쓰기 -> 1바이트
			fw.write('라');
			fw.write('마');
			fw.write('바');
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
