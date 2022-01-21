package com.web;

import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) throws IOException{
		ServerSocket serve=null;
		Socket sock=null;
//		InputStream is=null;
//		InputStreamReader isr=null;
//		BufferedReader br=null;
		OutputStream os=null;
		PrintStream ps=null;
		try {
			serve=new ServerSocket(80);
			sock=serve.accept();
//			is=sock.getInputStream();
//			isr=new InputStreamReader(is);
//			br=new BufferedReader(isr);
//			while(true){
//				String msg=br.readLine();
//				if(msg==null){break;}
//				System.out.println(br);
//			}
			os=sock.getOutputStream();
			ps=new PrintStream(os);
			ps.println("HTTP/1.1 200 OK");
			ps.println();
			ps.println("환영합니다");
//			ps.println("hi");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			ps.close();
			os.close();
			sock.close();
			serve.close();
		}
	}

}
