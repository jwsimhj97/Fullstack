package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex12_t extends Frame implements ActionListener{
	Button btn1, btn2;
	
	public Ex12_t(){
		Panel p=new Panel();
		p.setLayout(new GridLayout());
		btn1=new Button("����");
		btn2=new Button("����");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		p.add(btn1);
		p.add(btn2);
		btn1.setEnabled(true);
		btn2.setEnabled(false);
		
		
		add(p);
		setBounds(100,100,300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex12_t();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn=(Button)e.getSource();
		if(btn==btn1){
			btn1.setEnabled(false);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			btn2.setEnabled(true);
		}else if(btn==btn2){
			btn1.setEnabled(true);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			btn2.setEnabled(false);
		}
	}

}
