package com.hi;

import java.io.*;
import java.net.*;

public class Ex02 {

	public static void main(String[] args) {
		URL url=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		Writer fw=null;
		PrintWriter pw=null;
		try {
			url=new URL("https://m.naver.com");
			URLConnection conn=url.openConnection();
			is=conn.getInputStream();
			isr=new InputStreamReader(is,"UTF-8");
			br=new BufferedReader(isr);
			
			fw=new FileWriter("naver.html");
			pw=new PrintWriter(fw);
			
			String msg=null;
			while((msg=br.readLine())!=null){
				pw.println(msg);
			}
			
			pw.close();
			fw.close();
			
			br.close();
			isr.close();
			is.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
