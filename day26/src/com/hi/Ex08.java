package com.hi;

import java.io.*;

public class Ex08 {

	public static void main(String[] args) {
		PrintStream ps=System.out;
		OutputStreamWriter osw=new OutputStreamWriter(ps);
		BufferedWriter bw=new BufferedWriter(osw);
		try {
			bw.write("문자열스트림으로 전환");
			bw.newLine();
			bw.write("전환됨");
			
			bw.close();
			osw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
