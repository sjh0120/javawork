import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dir {

	public static void main(String[] args) {
		String path="C:\\Users\\BIT\\javawork\\day10";
		File root=new File(path);
		String[] list=root.list();
		String[] list2=null;
		
		if(root.exists() && root.isDirectory()) {
			if(root.getParent()==null) {
				list2=list;
			}else{
				list2=new String[list.length+2];
				list2[0]=".";
				list2[1]="..";
				System.arraycopy(list, 0, list2, 2, list.length);
			}

			for(int i=0; i<list2.length; i++) {
				File file=new File(root.getAbsolutePath() + "\\" +list2[i]);
				Date date=new java.util.Date(file.lastModified());
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd aa hh:mm");
				String msg= sdf.format(date);
				System.out.print(msg + "\t");
				if(file.isDirectory()) {
					System.out.print("<DIR>\t \t");
				}else {
					System.out.print("\t" + file.length() + "\t");
				}
				//System.out.print(new SimpleDateFormat("yyyy-MM-dd aa hh:mm").format(file.lastModified()));
				
				System.out.println(list2[i]);
			}
		}else {
			System.out.println("볼륨에는 이름이 없습니다");
			if(root.exists()) {
				Date date=new Date(root.lastModified());
				java.text.SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd aa hh:mm");
				String msg=sdf.format(date);
				System.out.print(msg + "\t");
				if(root.isDirectory()) {
					System.out.print("<DIR>\t \t");
				}else {
					System.out.print("\t" + root.length() + "\t");
				}
				//System.out.print(new SimpleDateFormat("yyyy-MM-dd aa hh:mm").format(file.lastModified()));
				
				System.out.println(root.getName());
			}
		}
		
	}

}
