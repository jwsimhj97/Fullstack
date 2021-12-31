package com.hi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex05 extends Frame{

	public Ex05(){
		java.awt.BorderLayout layout=new BorderLayout();
		Panel p=new Panel();
		p.setLayout(layout);
		
		Button btn1=new Button();
		Button btn2=new Button();
		Button btn3=new Button();
		Button btn4=new Button();
		Button btn5=new Button();
		
		btn4.setLabel("¸Þ´º");
		
//		p.add(btn1,BorderLayout.NORTH);
//		p.add(btn2,BorderLayout.SOUTH);
//		p.add(btn3,BorderLayout.EAST);
//		p.add(btn4,BorderLayout.WEST);
//		p.add(btn5,BorderLayout.CENTER);
		p.add(btn1,"North");
		p.add(btn2,"South");
		p.add(btn3,"East");
		p.add(btn4,"West");
		p.add(btn5,"Center");
		
		add(p);
		setLocation(100, 100);
		setSize(500,300);
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

}
