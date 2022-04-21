package co.bit.day12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Lec16 implements java.io.Serializable{
	private static final long serialVersionUID=2L;
	//직렬화의 대상(필드의 갯수)이 달라지면 자동으로 버전을 랜덤하게 바꿈
	//원래라면 사람이 직접해야함
	private int su=1111;
	transient int su2=2222;
	
	
	public void func() {
		System.out.println("바꾼기능 실행");
	}
	
	public int getSu() {
		return su;
	}
	
}


public class Ex16{

	public static void main(String[] args) {
		File file=new File("test07.bin");
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			
			oos.writeObject(new Lec16());
			
			
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
