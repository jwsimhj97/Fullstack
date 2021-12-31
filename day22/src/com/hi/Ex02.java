package com.hi;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Ex02 extends Frame{

	public Ex02(){
		Panel p=new Panel();
		p.setLayout(null);

//		Button btn=new Button("버튼");
		
//		JButton btn=new JButton("버튼");
//		Toolkit tool=Toolkit.getDefaultToolkit();
//		java.awt.Image image=tool.createImage("ebchu.jpg");
//		javax.swing.Icon icon=new javax.swing.ImageIcon(image);
//		btn.setIcon(icon);
		
		JLabel btn=new JLabel("버튼");
		java.awt.Font font=new Font("",Font.BOLD,22);
		btn.setFont(font);
		btn.setLocation(100,100);
		btn.setSize(200,200);
		p.add(btn);
		
		add(p);
		setLocation(100,100);
		setSize(400,400);
		setVisible(true);
		setResizable(false);
		System.out.println(p.getHeight());
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
