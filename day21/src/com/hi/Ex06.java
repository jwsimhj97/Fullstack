package com.hi;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.util.Scanner;

public class Ex06{
	
	public static void main(String[] args) {
		Frame f=new Frame();
		CardLayout layout=new CardLayout();
		Panel p1=new Panel();
		p1.setLayout(layout);
		
		Panel p2=new Panel();
		Panel p3=new Panel();
		Panel p4=new Panel();
		
		Button btn2=new Button();
		Button btn3=new Button();
		Button btn4=new Button();
		
		btn2.setLabel("첫번째");
		btn3.setLabel("두번째");
		btn4.setLabel("세번째");
		
		p2.add(btn2);		
		p3.add(btn3);		
		p4.add(btn4);
		
		p1.add(p2);
		p1.add(p3);
		p1.add(p4);
		
		f.add(p1);
		f.setLocation(100, 100);
		f.setSize(300,400);
		f.setVisible(true);
				
		Scanner sc=new Scanner(System.in);
		while(true){
			sc.nextLine();
			layout.next(p1);
		}
	}

}
