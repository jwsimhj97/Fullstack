package com.hi;

import java.io.IOException;
import java.io.InputStream;

public class Ex09 {

	public static void main(String[] args) {
		InputStream is=System.in;
		try{	// 'a' -> 97 13(\r) 10(\n)
			System.out.println(is.read());
//			System.out.println(is.read());
//			System.out.println(is.read());
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
