package com.hi;

import java.awt.Frame;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Frame f=new Frame("제목없음");
		f.setLocation(300, 300);
		f.setSize(300, 300);
		f.setVisible(true);
		System.out.println(f.getWidth()+","+f.getHeight());
		System.out.println(f.isVisible());
		Scanner sc=new Scanner(System.in);
		String msg=sc.nextLine();
		System.out.println(f.getWidth()+","+f.getHeight());
		System.out.println(f.getX()+","+f.getY());
		f.setTitle(msg);
	}

}
