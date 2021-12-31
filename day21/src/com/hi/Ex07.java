package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex07 extends Frame{

	public Ex07(){
		GridBagLayout layout=new GridBagLayout();
		Panel p=new Panel();
		p.setLayout(layout);
		
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		Button btn1=new Button();
		gbc.weightx=2.0;
		p.add(btn1,gbc);
		Button btn2=new Button();
		gbc.weightx=1.0;
		gbc.gridx=1;
		p.add(btn2,gbc);
		Button btn3=new Button();
		gbc.gridx=2;
		p.add(btn3,gbc);
		Button btn4=new Button();
		gbc.gridx=3;
		p.add(btn4,gbc);
		Button btn5=new Button();
		gbc.gridx=0;
		gbc.gridy=1;
		p.add(btn5,gbc);
		Button btn6=new Button();
		gbc.gridx=1;
		gbc.gridheight=2;
		p.add(btn6,gbc);
		Button btn7=new Button();
		gbc.gridx=2;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		p.add(btn7,gbc);
		Button btn8=new Button();
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		p.add(btn8,gbc);
		Button btn9=new Button();
		gbc.gridx=2;
		gbc.gridy=2;
		p.add(btn9,gbc);
		Button btn10=new Button();
		gbc.gridx=3;
		gbc.gridy=2;
		p.add(btn10,gbc);
		
		add(p);
		setLocation(100,100);
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex07();
	}

}
