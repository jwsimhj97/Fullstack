package com.hi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Ex10_t extends Frame{
	public Ex10_t(){
		BorderLayout layout=new BorderLayout();	// ��ü border layout�����
		Panel p=new Panel();	// ��ü �г�
		p.setLayout(layout);

		GridLayout ltop=new GridLayout(1,1);
		GridLayout lbtt=new GridLayout(4,3);
		Panel ptop=new Panel();	// ž �г�
		Panel pbtt=new Panel();	// ���� �г�
		ptop.setLayout(ltop);
		pbtt.setLayout(lbtt);	

		Font f=new Font(Font.SANS_SERIF,Font.BOLD,50);
		TextField tf=new TextField();
		tf.setFont(f);
//		tf.setFont(new Font("",0,50){});
		ptop.add(tf);
		
		for(int i=0; i<12; i++){
			if(i+1<10){
				pbtt.add(new Button(i+1+""));
			}else if(i+1==10){
				pbtt.add(new Button("*"));
			}else if(i+1==11){
				pbtt.add(new Button("0"));
			}else if(i+1==12){
				pbtt.add(new Button("#"));
			}
		}
		
		p.add(ptop,BorderLayout.NORTH);
		p.add(pbtt,BorderLayout.CENTER);
		
		add(p);
		setLocation(100, 100);
		setSize(300,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// ����
		new Ex10_t();
	}

}
