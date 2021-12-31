package com.hi;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Ex01 extends Frame{

	public Ex01(){
		java.awt.Toolkit tool=Toolkit.getDefaultToolkit();
		tool.beep();
		Dimension dim=tool.getScreenSize();
//		System.out.println(dim.width/2-(500/2)+":"+dim.height/2-(400/2));
		setLocation(0,0);
		setSize(500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
