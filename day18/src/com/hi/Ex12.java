package com.hi;

import java.io.File;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) {
		File file=new File("text2.txt");
		if(file.exists()){
			System.out.println("존재합니다");
		}else{
			try{
				boolean boo=file.createNewFile();
				if(boo){
					System.out.println("파일생성...");
				}else{
					System.out.println("파일생성실패...");
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
