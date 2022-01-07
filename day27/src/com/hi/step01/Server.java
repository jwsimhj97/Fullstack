package com.hi.step01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		ServerSocket serv=null;
		Socket sock=null;
		OutputStream os=null;
		try {
			serv=new ServerSocket(5001);
			System.out.println("server> Ŭ���̾�Ʈ ���� �����...");
			sock=serv.accept();
			InetAddress addr=sock.getInetAddress();
			System.out.println("server> "+addr.getHostAddress());
			String msg="ȯ���մϴ�";
			os=sock.getOutputStream();
			os.write(msg.getBytes());
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				os.close();
				sock.close();
				serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
