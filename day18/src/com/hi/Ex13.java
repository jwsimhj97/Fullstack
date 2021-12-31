package com.hi;

import java.io.File;

public class Ex13 {

	public static void main(String[] args) {
		File file=new File("dist");
		if(file.exists()){
			boolean boo=file.delete();
			System.out.println(boo);
		}else{
			System.out.println("파일이 없습니다");
		}
	}

}
