package com.hi;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;

public class Ex03 extends Frame{

	public Ex03(){
		setBackground(Color.RED);
		
//		Frame f=new Frame();
//		f.setBackground(Color.BLUE);
//		f.setLocation(200,200);
//		f.setSize(300,200);
//		f.setVisible(true);
		
		setLocation(100,100);
		setSize(600,500);
		setVisible(true);
		
//		java.awt.Dialog dl=new Dialog(this,"제목없음",true);	// true되어있다면 dl.setVisible이 false가 되기 전까지는 다음창을 움직이지 못한다 
//		dl.setLocation(200,200);
//		dl.setSize(300,200);
//		dl.setVisible(true);
		
		java.awt.FileDialog dl=new FileDialog(this,"",FileDialog.SAVE);	// 버튼변경 - LOAD 열기 / SAVE 저장
 		dl.setLocation(200,200);
		dl.setSize(300,200);
		dl.setVisible(true);
		System.out.println(dl.getDirectory()+","+dl.getFile());

	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
