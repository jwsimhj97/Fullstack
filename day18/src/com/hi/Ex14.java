package com.hi;

import java.io.File;

public class Ex14 {

	public static void main(String[] args) {
		File file=new File("dist");
		if(file.exists()){
			System.out.println("동일폴더가 존재합니다");
		}else{
			boolean boo=file.mkdir();
			System.out.println(boo);
		}
	}

}
