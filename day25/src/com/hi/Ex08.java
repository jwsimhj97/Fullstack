package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		File file=new File("test01.txt");
		
		try {
			FileReader fr=new FileReader(file);			
			while(true){
				int su=fr.read();
				if(su==-1){break;}
				System.out.println((char)su);
			}			
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
