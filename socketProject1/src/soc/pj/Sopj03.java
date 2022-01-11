package soc.pj;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Sopj03 extends Frame{
	private JTextArea ta;
	
	File dir = new File("D:\\javaWork\\socketProject1\\shareBox");
	File[] files = dir.listFiles();
	JButton[] wrlist=new JButton[files.length];
	

	static int listNum=0;

	
	public Sopj03(){	// 게시글 list별 내용
		Panel listCoP=new Panel();	// 전체패널
		listCoP.setLayout(new BorderLayout());
		addWindowListener(new WindowAdapter() {		// p패널 창닫기
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
			
		String fiPath=files[listNum].getPath();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(fiPath));
			String str;
			while ((str = reader.readLine()) != null) {
	//			System.out.println(str);
	
				ta = new JTextArea(str); 
				JScrollPane scrollPane = new JScrollPane(ta);		
				listCoP.add(ta); 
			}
			reader.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

//		files[0].getPath();
		
		add(listCoP);
		setBounds(100,100,600,400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Sopj03();
	}

}
