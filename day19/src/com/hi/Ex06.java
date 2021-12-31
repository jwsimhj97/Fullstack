package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		File file=new File("test05.txt");
		byte[] buf=new byte[5];
		try{
			FileInputStream fis=new FileInputStream(file);
			while(true){
				int su=fis.read(buf);
				if(su==-1){break;}
//				System.out.println(Arrays.toString(buf));
//				System.out.print(new String(buf));
				System.out.print(new String(buf,0,su));
			}
			fis.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
