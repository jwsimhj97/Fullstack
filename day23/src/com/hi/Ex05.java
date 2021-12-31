package com.hi;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex05 extends Frame{
	
//	class Lec55 extends WindowAdapter{
//		@Override
//		public void windowClosing(WindowEvent e) {
//			dispose();
//		}
//	}

	public Ex05(){
		WindowAdapter adapter=new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println("종료하겠습니다");
			}
		};
		
		addWindowListener(adapter);
		setBounds(100, 100, 500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

}
