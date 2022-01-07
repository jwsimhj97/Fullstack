package com.hi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		File file=new File("test01.txt");
		String msg="한글로 작성하든\r\n영문으로 작성하든\r\n잘 작성됩니다";
		try {
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			
			bw.write("한글로 작성하든");
			bw.write("\r\n");
			bw.write("영문으로 작성하든");
			bw.write("\r\n");
			bw.write("잘 작성됩니다");
			
			bw.close();
			fw.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
