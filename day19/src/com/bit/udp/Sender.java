package com.bit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Sender {

	public static void main(String[] args) {
		byte[] arr= {127,0,0,1};//종착지점 / 받는곳
		InetAddress addr=null;
		int port=5000;
		
		
		DatagramSocket dsock=null;
		DatagramPacket packet=null;
		try {
			addr=InetAddress.getByAddress(arr);
			dsock=new DatagramSocket();
			
			String msg="helloUDP";
			packet=new DatagramPacket(msg.getBytes(),msg.length(),addr,port);
			
			dsock.send(packet);
			
			String msg2="잘받았습니다";//왜 한글안되냐?
			packet=new DatagramPacket(msg2.getBytes(),msg2.length(),addr,port);
			
			dsock.send(packet);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(dsock!=null)dsock.close();
			
		}
		
		
	}

}
