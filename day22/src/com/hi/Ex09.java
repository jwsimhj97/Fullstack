package com.hi;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex09 extends Frame implements ActionListener{

	public Ex09(){
		MenuBar mb=new MenuBar();
		Menu mn=new Menu("메뉴");
		MenuItem mi=new MenuItem("실행");
		mn.add(mi);
		mb.add(mn);
		mi.addActionListener(this);
		
		setMenuBar(mb);
		
		setBounds(100,100,400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex09 me=new Ex09();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("이벤트발생");
		dispose();
	}

}
