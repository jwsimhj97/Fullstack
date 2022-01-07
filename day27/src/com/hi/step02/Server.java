package com.hi.step02;
// ���ڼ���
import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		int port=5001;
		ServerSocket serv=null;
		Socket sock=null;
		InputStream is=null;
		OutputStream os=null;
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		
		try {
			serv=new ServerSocket(5001);
			sock=serv.accept();
			is=sock.getInputStream();
			os=sock.getOutputStream();
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			
			while(true){
				int su=isr.read();
				osw.write(su);
				osw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
//				osw.close();
//				isr.close();
				os.close();
				is.close();
				sock.close();
				serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
