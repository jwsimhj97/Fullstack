package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		File file=new File("city.jpg");
		File copy=new File("copy.jpg");
		try {
			copy.createNewFile();
			FileInputStream is=new FileInputStream(file);
			FileOutputStream os=new FileOutputStream(copy);
			while(true){
				int su=is.read();	// 읽어오다
				if(su==-1){break;}
				os.write(su);
			}
			is.close();
			os.close();
			System.out.println("복사완료...");
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
