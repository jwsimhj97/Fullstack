package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		File file=new File("test01.txt");
		char[] buff=new char[3];
		try {
			FileReader fr=new FileReader(file);
			while(true){
				int su=fr.read(buff);
				if(su==-1){break;}
				System.out.print(new String(buff,0,su));
			}
			
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
