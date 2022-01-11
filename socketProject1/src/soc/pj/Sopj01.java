package soc.pj;
// main 창		

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class Sopj01 extends Frame implements ActionListener{
	JButton writeBtn, listBtn;
	Panel pCont,pContList;
	
	File dir = new File("D:\\javaWork\\socketProject1\\shareBox");
	File[] files = dir.listFiles();
	JButton[] wrlist=new JButton[files.length];
	JLabel[][] listLineLa;
	int listLength=files.length;
	
	
	public void ListCont(){		// 게시글 list		
//		[][4]
		listLineLa=new JLabel[listLength][4]; // [파일갯수][4=no,제목,작성자,날짜]
		System.out.println(pContList);
		for(int i=0; i<listLineLa.length; i++) {
			for(int j=0; j<listLineLa[i].length; j++) {
				listLineLa[i][j]=new JLabel("아");
				pContList.add(listLineLa[i][j]);
			}
		}
//		for(int i=0; i<wrlist.length; i++){
//			wrlist[i]=new JButton((i+1)+files[i].getName());
//			wrlist[i].addActionListener(this);	
//			pContList.add(wrlist[i]);		
//		}
		
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
		
		Font topTitf=new Font(Font.SANS_SERIF, Font.PLAIN, 20);
		Panel pTop=new Panel();				// 탑패널 start
		pTop.setLayout(new GridLayout(1,4));
		JLabel[] tLa=new JLabel[4];
		
		tLa[0]=new JLabel("No.");
		tLa[0].setFont(topTitf);
		tLa[1]=new JLabel("제목");
		tLa[1].setFont(topTitf);
		tLa[2]=new JLabel("작성자");
		tLa[2].setFont(topTitf);
		tLa[3]=new JLabel("날짜");
		tLa[3].setFont(topTitf);
		for(int i=0; i<4; i++){
			tLa[i].setHorizontalAlignment(JLabel.CENTER);
			tLa[i].setForeground(Color.WHITE);	// j라벨 font색변경
			tLa[i].setBackground(Color.DARK_GRAY);
			tLa[i].setOpaque(true);
			pTop.add(tLa[i]);
		}
		p.add(pTop, BorderLayout.NORTH);	// 탑패널 end
		
		
		
		
		pCont=new Panel();					// 컨텐츠패널 start
		pContList=new Panel();
		pContList.setLayout(new GridLayout(wrlist.length,4));
		ListCont();		// 컨텐츠 - 게시글list
		pCont.add(pContList);
		p.add(pCont, BorderLayout.CENTER);	// 컨텐츠패널 end
		
		
		
		
		Panel pBotn=new Panel();			// 바텀패널 start
		
		
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
		}		
		
		for(int i=0; i<wrlist.length; i++){	// 리스트별 버튼
			if(obj==wrlist[i]){
				Sopj03.listNum=i;
				new Sopj03();
			}
		}
	}

}
