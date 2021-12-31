package com.hi;

import java.awt.Frame;

public class Ex02 extends Frame{
	
	public Ex02(){
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex02 me=new Ex02();
		System.out.println("main thread...");
	}

}
