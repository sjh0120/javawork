package com.bit.day11;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex15 {

	public static void main(String[] args) {
		String msg="abcdefg";
		File file=new File("test08.txt");
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		try {
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos);
			byte[] arr=msg.getBytes();
			
//			for(int i =0; i<arr.length; i++) {
//				bos.write(arr[i]);
//			}
			
			bos.write(arr);
			//bos.flush();
			//close()를 안했을 경우 버퍼의 메모리가 꽉 차지 않더라도 이때까지의 내용을
			//메모리에서 기억장치로 밀어내는 코드!
			//즉 close()메서드 안에 flush()메서드가 이미 존재한다!
			//ㄴ> close()를 하게되면 버퍼 메모리에 있는 내용을 기억장치로 밀어내서 저장해야하기 때문에
			//ㄴㄴ>close()안에 flush()가 존재한다!
			//+flush()를 너무 자주 써버리면 메모리의 크기가 꽉 차기 전에 계속 밀어내기 때문에 낭비가 발생한다
			//++flush()를 너무 늦게 쓰면?
			//메모리가 차면 내보내겠지만, close()를 하기전에 에러가 발생할 수 있다.
			
			bos.close();
			fos.close();
			//close()를 안해주면 bos.write(arr);은 메모리에 만 쓴 경우
			//버퍼 메모리에만 쓰고 close()를 해줘야만 메모리에 쓴거를 기억장치에 저장한다
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
