package com.bit.udp;

import java.io.IOException;
import java.net.*;

public class Receiver {

	public static void main(String[] args) {
		byte[] buf= new byte[8]; //크기가 고정적이다!
		//일방적인 BroadCast에서만 사용
		//대표적으로 스트리밍!
		DatagramSocket sock=null;
		DatagramPacket p=null;
		
		//UDP -> 피켓들을 통해서 정보를 전달하며,
		//피켓들은 목적지에 대한 정보를 가지고 떠돌고 있음
		//즉 떠돌다가 운이 좋으면 빨리도착, 안좋으면 늦게 도착
		//-> 네트워크 정체 발생 + 네트워크 과부화
		//=> 이렇게 떠돌아 다니는 것을 라우터는 공격패턴으로 인식하여 차단함
		//이론상으로 티비에서 써야하지만 네트워크 혼잡이 발생하므로 실질적으로 안씀!
		
		try {
			sock=new DatagramSocket(5000);
			p=new DatagramPacket(buf, buf.length);
			sock.receive(p);
			
			System.out.println(new String(buf));
			
			p=new DatagramPacket(buf, buf.length);
			sock.receive(p);
			
			System.out.println(new String(buf));
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(sock!=null)sock.close();
		}
	}

}
