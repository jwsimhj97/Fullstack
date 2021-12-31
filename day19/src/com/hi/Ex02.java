package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		File file=new File("test01.bin");
		if(!file.exists()){
			try{
				file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		String msg="한글";
		try{
			FileOutputStream out=new java.io.FileOutputStream(file);
//			char[] arr=msg.toCharArray();
			byte[] arr=msg.getBytes();
			for(int i=0; i<arr.length; i++){
				out.write(arr[i]);
			}
			out.close();
			
//			out.write('a');
//			out.write('b');
//			out.write('c');
//			out.write('d');
//			out.close();
			System.out.println("작성완료");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
//		new java.io.FileOutputStream(file);
	}

}
