package soc.pj;
//글쓰기창

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class Sopj02 extends Frame implements ActionListener{

	MenuItem mi1,mi2,mi3,mi4,mi5;
	TextField tfId,tfPw,taTitle;
	TextArea ta;
	String title="제목없음";
	
	public Sopj02(){
		Panel p=new Panel();
		p.setLayout(new BorderLayout());
//		p.setLayout(new GridLayout(2,1));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		MenuBar bar=new MenuBar();
		Menu mn1=new Menu("파일");
		Menu mn2=new Menu("도움말");
		bar.add(mn1);
		bar.add(mn2);
		mi1=new MenuItem("새파일");
		mi3=new MenuItem("저장");
		mi4=new MenuItem("취소");
		mi5=new MenuItem("정보");
		mn1.add(mi1);
		mn1.addSeparator();
		mn1.add(mi3);
		mn1.addSeparator();
		mn1.add(mi4);
		mn2.add(mi5);		
		mi1.addActionListener(this);	
		mi3.addActionListener(this);	
		mi4.addActionListener(this);		
		mi5.addActionListener(this);			
		setTitle(title);
		setMenuBar(bar);
		
		Font f=new Font(Font.SANS_SERIF, Font.PLAIN, 16);
		
		Panel p1=new Panel();	// 아이디비번패널
		p1.setLayout(new GridLayout(1,4));
		
		JLabel laId=new JLabel("아이디 >>");
		laId.setHorizontalAlignment(JLabel.CENTER);
		laId.setForeground(Color.WHITE);	// j라벨 font색변경
		laId.setBackground(Color.DARK_GRAY);
		laId.setOpaque(true);
		tfId=new TextField();		
		
		JLabel laPw=new JLabel("비밀번호 >>");
		laPw.setHorizontalAlignment(JLabel.CENTER);
		laPw.setForeground(Color.WHITE);	// j라벨 font색변경
		laPw.setBackground(Color.DARK_GRAY);
		laPw.setOpaque(true);        
		tfPw=new TextField();
		
		p1.add(laId);
		p1.add(tfId);
		p1.add(laPw);
		p1.add(tfPw);
		p1.setFont(f);
		p.add(p1, BorderLayout.NORTH);
		
		
		Panel p2=new Panel();	// 제목패널
		p2.setLayout(new BorderLayout());
//		p2.setLayout(new GridLayout(1,4));
		JLabel laTitle=new JLabel("  제목 >>  ");
		laTitle.setHorizontalAlignment(JLabel.CENTER);
		laTitle.setForeground(Color.WHITE);	// j라벨 font색변경
		laTitle.setBackground(Color.DARK_GRAY);
		laTitle.setOpaque(true);
		taTitle = new TextField();
		p2.add(laTitle, BorderLayout.WEST);
		p2.add(taTitle, BorderLayout.CENTER);
		p2.setFont(f);
		p.add(p2, BorderLayout.CENTER);
		
		
		Panel p3=new Panel();	// 내용패널
		p3.setLayout(new GridLayout(1,1));
		ta=new TextArea();
		p3.add(ta);
		p.add(p3, BorderLayout.SOUTH);
		
		
		
		add(p);
		setBounds(100, 100, 500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Sopj02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj==mi1){
			tfId.setText("초기화");
			tfId.setText("");
			tfPw.setText("초기화");
			tfPw.setText("");
			taTitle.setText("초기화");
			taTitle.setText("");
			ta.setText("초기화");
			ta.setText("");
			this.setTitle(title);
		}else if(obj==mi3){
			System.out.println("저장");
			title=taTitle.getText();
			this.setTitle(title);
			
			File file=new File(".\\shareBox\\"+taTitle.getText());
			if(!file.exists()){
				try {
					file.createNewFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}		

			String msg=ta.getText();
			try {
				FileOutputStream out=new java.io.FileOutputStream(file);
				byte[] arr=msg.getBytes();
				for(int i=0; i<arr.length; i++){
					out.write(arr[i]);
				}
				out.close();
				System.out.println("작성완료");
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}else if(obj==mi4){
			dispose();
		}else if(obj==mi5){
			Dialog dia=new Dialog(this,"정보",true);
			Panel p=new Panel();
			Panel p2=new Panel();
			p2.setLayout(new GridLayout(2,1));
			p2.add(new Label("내가 수업을 위해 만들었습니다"));
			Label la2=new Label("2021.12.31");
			la2.setAlignment(Label.CENTER);
			p2.add(la2);
			p.setLayout(new BorderLayout());
			p.add(p2,BorderLayout.CENTER);
			Button btn=new Button("확인");
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					dia.dispose();
				}			
			});
			p.add(btn,BorderLayout.SOUTH);
			dia.add(p);
			dia.setBounds(250, 200, 200, 100);
			dia.setVisible(true);
		}
	}

}
