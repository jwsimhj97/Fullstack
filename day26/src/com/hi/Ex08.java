package com.hi;

import java.io.*;

public class Ex08 {

	public static void main(String[] args) {
		PrintStream ps=System.out;
		OutputStreamWriter osw=new OutputStreamWriter(ps);
		BufferedWriter bw=new BufferedWriter(osw);
		try {
			bw.write("���ڿ���Ʈ������ ��ȯ");
			bw.newLine();
			bw.write("��ȯ��");
			
			bw.close();
			osw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
