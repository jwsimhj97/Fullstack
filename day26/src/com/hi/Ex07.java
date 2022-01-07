package com.hi;

import java.io.*;

public class Ex07 {

	public static void main(String[] args) {
		InputStream inn=System.in;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		isr=new InputStreamReader(inn);
		br=new BufferedReader(isr);
		
		try {
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());			
			
			br.close();
			isr.close();
			inn.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
