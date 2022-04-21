package com.bit.tcp.step2;

import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		ServerSocket serve=null;
		Socket sock=null;
		InputStream is=null;
		OutputStream os=null;
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try {
			serve=new ServerSocket(5000);
			sock=serve.accept();
			
			is=sock.getInputStream();
			os=sock.getOutputStream();
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			br=new BufferedReader(isr);
			bw=new BufferedWriter(osw);
			
			while(true) {
				String msg=br.readLine();
				bw.write("re : " + msg);
				bw.newLine();
				bw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null)bw.close();
				if(br!=null)br.close();
				if(osw!=null)osw.close();
				if(isr!=null)isr.close();
				if(os!=null)os.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
				if(serve!=null)serve.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
