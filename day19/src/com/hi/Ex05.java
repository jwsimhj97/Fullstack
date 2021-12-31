package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		String msg="zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzvvvvvvvvvvvvvvvvvvvvvvvvvvvddddddddddddddddddddddddd11111111";
		File file=new File("test05.txt");
		
		try {
			file.createNewFile();
			
			FileOutputStream fos=new FileOutputStream(file);
			byte[] by=msg.getBytes();
			fos.write(by);
			
			fos.close();
			System.out.println("³¡");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
