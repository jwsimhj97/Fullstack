package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		File file=new File("test01.bin");
		if(file.exists()){
			try {
				FileInputStream is=new java.io.FileInputStream(file);
				int su=1;
				byte[] arr=new byte[4];
				for(int i=0; i<arr.length; i++){
					su=is.read();
					arr[i]=(byte)su;
				}
				String msg=new String(arr);
				System.out.println(msg);
				is.close();
				
				
//				while(true){
//					su=is.read();
//					if(su==-1){break;}
//					System.out.print((char)su);
//				}
//				is.close();
				
//				int su=is.read();
//				System.out.println(su);
//				su=is.read();
//				System.out.println(su);
//				su=is.read();
//				System.out.println(su);
//				su=is.read();				// write된것보다 read하는게 더 많을경우 값은 -1
//				System.out.println(su);
//				
//				is.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
