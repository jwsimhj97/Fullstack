package com.hi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10 {

	public static void main(String[] args) {
		File file=new File("test01.txt");
		String msg="한글로 작성해도 쉽게\r\n 작성이 가능한 것이 문자열스트림입니다";
		char[] buff=msg.toCharArray();
		
		try {
			FileWriter fw=new FileWriter(file);
			fw.write(buff);
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
