package com.hi;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex10 extends Frame{

	public Ex10(){	
		GridBagLayout layoutAll=new GridBagLayout();
		Panel p1=new Panel();
		p1.setLayout(layoutAll);
		
		Panel p2=new Panel();	
		p2.setLayout(layoutAll);
		p1.add(p2);
		
		TextArea ta1=new TextArea("디폴트텍스트",3,10,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		p2.add(ta1);
		
		Panel p3=new Panel();
		p3.setLayout(layoutAll);
		p1.add(p3);
		Font f=new Font(Font.SERIF, Font.BOLD, 22){};
		p3.setFont(f);
		
		Button btn1=new Button("1");
		Button btn2=new Button("2");
		Button btn3=new Button("3");
		Button btn4=new Button("4");
		Button btn5=new Button("5");
		Button btn6=new Button("6");
		Button btn7=new Button("7");
		Button btn8=new Button("8");
		Button btn9=new Button("9");
		Button btn10=new Button("#");
		Button btn11=new Button("0");
		Button btn12=new Button("*");
		
		java.awt.GridLayout layout2=new GridLayout(4,3);
		p3.setLayout(layout2);
		p3.add(btn1);
		p3.add(btn2);
		p3.add(btn3);
		p3.add(btn4);
		p3.add(btn5);
		p3.add(btn6);
		p3.add(btn7);
		p3.add(btn8);
		p3.add(btn9);
		p3.add(btn10);
		p3.add(btn11);
		p3.add(btn12);
		
		add(p1);
		
		setLocation(100, 100);
		setSize(300, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex10();
	}

}
