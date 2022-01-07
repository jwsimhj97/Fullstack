package com.hi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) {
		File file=new File("test01.txt");
		
		try {
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			
			while(true){
				String msg=br.readLine();
				if(msg==null){break;}
				System.out.println(msg);
			}
			
//			System.out.println(br.readLine());	// 개행이전까지의 내용을 불러온다
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
