package com.hi;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex11 extends Frame implements MouseMotionListener{
	
	public Ex11(){
		Panel p=new Panel();
		p.addMouseMotionListener(this);
		
		add(p);
		setBounds(100,100,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex11();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("������Ʈ ���� :"+e.getX()+","+e.getY());
		System.out.println("ȭ����� :"+e.getXOnScreen()+","+e.getYOnScreen());
//		System.out.println("�巹��");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("����");
	}

}
