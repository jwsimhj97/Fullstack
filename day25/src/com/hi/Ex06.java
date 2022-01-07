package com.hi;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		File file=new File("test02.bin");
		File copy=new File("test05.bin");
		
		try {
			if(!copy.exists()){
				copy.createNewFile();
			}
			
			FileInputStream fis=new FileInputStream(file);
			ByteArrayOutputStream baos=new ByteArrayOutputStream();
			while(true){
				int su=fis.read();
				if(su==-1){break;}
				baos.write(su);
			}
			byte[] buf=baos.toByteArray();
//			System.out.println(new String(buf));
			FileOutputStream fos=new FileOutputStream(copy);
			ByteArrayInputStream bais=new ByteArrayInputStream(buf);
			while(true){
				int su=bais.read();
				if(su==-1){break;}
				fos.write(su);
			}
			baos.close();
			bais.close();
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
