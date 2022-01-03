package com.hi;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex10_t extends Frame implements ActionListener{
	static Label la;
	
	public Ex10_t(){
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		la=new Label();
		
		add(la);
		setBounds(100,100,200,100);
		setVisible(true);
	}

	public static void main(String[] args) {		
		Ex10_t me=new Ex10_t();
		for(int i=60; i>=0; i--){
			la.setText(""+i+"��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
	}

}
