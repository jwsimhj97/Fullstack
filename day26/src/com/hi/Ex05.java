package com.hi;

import java.io.*;

public class Ex05 {

	public static void main(String[] args) {
		// byteStream -> StringStream
		OutputStream os=null;
		Writer osw=null;
		BufferedWriter bw=null;
		
		try {
			os=new FileOutputStream("test05.txt");
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);			
			bw.write("문자열1");
			bw.newLine();
			bw.write("문자열2");
			bw.newLine();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bw.close();
				osw.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
