package soc.pj;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Sopj03 extends Frame{
	private JTextArea ta;
	
	public Sopj03(){	// 게시글 list별 내용
		Panel listCoP=new Panel();	// 전체패널
		listCoP.setLayout(new BorderLayout());
		addWindowListener(new WindowAdapter() {		// p패널 창닫기
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		ta = new JTextArea(); 
		JScrollPane scrollPane = new JScrollPane(ta);		
		listCoP.add(ta); 
		
		
		add(listCoP);
		setBounds(100,100,600,400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Sopj03();
	}

}
