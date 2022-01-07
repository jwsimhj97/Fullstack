package com.hi.step02;
//에코서버
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Socket sock=null;
		InputStream is=null;
		OutputStream os=null;
		OutputStreamWriter osw=null;
		InputStreamReader isr=null;
		Scanner sc=new Scanner(System.in);
		
		try {
			sock=new Socket("localhost",5001);
			os=sock.getOutputStream();
			is=sock.getInputStream();
			osw=new OutputStreamWriter(os);
			isr=new InputStreamReader(is);
			
			int su=-1;
			while(true){
				String msg=sc.nextLine();
	//			byte[] arr="한글".getBytes();
				for(int i=0; i<msg.length(); i++){
					osw.write(msg.charAt(i));
					osw.flush();
					su=isr.read();
					System.out.print((char)su);	
				}
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				osw.close();
				isr.close();
				os.close();
				is.close();
				sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
