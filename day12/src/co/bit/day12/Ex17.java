package co.bit.day12;

import java.io.*;

public class Ex17 {

	public static void main(String[] args) {
		File file=new File("test07.bin");
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			
			Lec16 obj=(Lec16)ois.readObject();
			
			
			ois.close();
			fis.close();
			
			System.out.println(obj.su2);
			//su2값은 직렬대상에서 제외
			//ㄴ> 내가 목적으로 하는 값에서 제외
			obj.func();
			//Ex16 에서 func()를 바꾸고 컴파일 하지않고
			//Ex17을 돌려도 변경된 값으로 나온다!
			//ㄴ> 즉 test07.bin에 func()메서드는 메서드로 넘어오지 않는다!
			//ㄴ> 메서드는 객체 직렬화 과정에서 빠진다!
			//ㄴ> 진열의 대상 -> 필드 => 객체의 속성(객체만이 가진 고유한 값)을 가진다!
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
