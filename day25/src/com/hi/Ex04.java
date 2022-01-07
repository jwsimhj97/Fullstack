package com.hi;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		File file=new File("test04.bin");
		
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			FileOutputStream fos=new FileOutputStream(file);
			DataOutputStream dos=new DataOutputStream(fos);
			dos.write(65);
			int su1=97;
			dos.writeInt(su1);
			double su2=3.14;
			dos.writeDouble(su2);
			char su3='#';
			dos.writeChar(su3);
			boolean boo=true;
			dos.writeBoolean(boo);
			String msg="문자열";
			dos.writeUTF(msg);
			
			dos.close();
			fos.close();
			System.out.println("작성끝");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
