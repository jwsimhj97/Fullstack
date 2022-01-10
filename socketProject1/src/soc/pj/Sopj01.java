package soc.pj;
// main 창		

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class Sopj01 extends Frame implements ActionListener{
	JButton writeBtn, listBtn;
	Panel pCont;
	
	File dir = new File("D:\\javaWork\\socketProject1\\shareBox");
	File[] files = dir.listFiles();
	JButton[] wrlist=new JButton[files.length];
	
	public void ListCont(){		// 게시글 list					
		for(int i=0; i<wrlist.length; i++){
//			pCont.setLayout(new GridLayout(wrlist.length,1));
			wrlist[i]=new JButton((i+1)+files[i].getName());
			wrlist[i].addActionListener(this);
			pCont.add(wrlist[i]);
		}
		
	}
	
	public Sopj01(){			
		Panel p=new Panel();	// 전체패널
		p.setLayout(new BorderLayout());
		addWindowListener(new WindowAdapter() {		// p패널 창닫기
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		Panel pTop=new Panel();				// 탑패널 start
		p.add(pTop, BorderLayout.NORTH);	// 탑패널 end
		
		
		
		
		pCont=new Panel();					// 컨텐츠패널 start
		ListCont();		// 컨텐츠 - 게시글list
		p.add(pCont, BorderLayout.CENTER);	// 컨텐츠패널 end
		
		
		
		
		Panel pBotn=new Panel();			// 바텀패널 start
		listBtn=new JButton("목록");
		listBtn.addActionListener(this);
		pBotn.add(listBtn);
		
		
		writeBtn=new JButton("글쓰기");
		writeBtn.addActionListener(this);
		pBotn.add(writeBtn);
		p.add(pBotn, BorderLayout.SOUTH);	// 바텀패널 end
		
		
		
		
		add(p);
		setBounds(100, 100, 800, 600);
		setVisible(true);
	}

	public static void main(String[] args) {	
		new Sopj01();
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		Object obj=e.getSource();
		if(obj==writeBtn){		// 글쓰기버튼
			new Sopj02();
		}else if(obj==listBtn){	// 목록버튼		
			System.out.println("목록버튼입니다");
//			if (files.length > 0) {
//			    for (int i=0; i < files.length; ++i) {
//			        System.out.println(files[i]);
////					wrlist.setText(files[i].getName());
//			    }
//			}
		}
		
		
		for(int i=0; i<wrlist.length; i++){	// 리스트별 버튼
			if(obj==wrlist[i]){
				new Sopj03();
//				System.out.println(wrlist[i].getText());
			}
		}
	}

}
