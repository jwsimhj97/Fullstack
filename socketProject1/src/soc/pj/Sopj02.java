package soc.pj;
//글쓰기창

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Sopj02 extends Frame implements ActionListener{

	MenuItem mi1,mi2,mi3,mi4,mi5;
	TextArea ta;
	String title="제목없음";
	
	public Sopj02(){
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setTitle(title);
		MenuBar bar=new MenuBar();
		Menu mn1=new Menu("파일");
		bar.add(mn1);
		mi1=new MenuItem("새파일");
//		mi2=new MenuItem("열기");
		mi3=new MenuItem("저장");
		mi4=new MenuItem("취소");
		mn1.add(mi1);
//		mn1.add(mi2);
		mn1.addSeparator();
		mn1.add(mi3);
		mn1.addSeparator();
		mn1.add(mi4);
		mi1.addActionListener(this);	
//		mi2.addActionListener(this);	
		mi3.addActionListener(this);	
		mi4.addActionListener(this);		
			
		
		ta=new TextArea();
		
		setMenuBar(bar);
		add(ta);
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
			this.setTitle(title);
			ta.setText("초기화");
			ta.setText("");
//		}
//		else if(obj==mi2){
//			FileDialog dia=new FileDialog(this, "열기",FileDialog.LOAD);
//			dia.setVisible(true);
//			File file=new File(dia.getDirectory()+dia.getFile());
//			if(!file.exists()){return;}
//			byte[] buf=new byte[(int)file.length()];
//			try {
//				FileInputStream fis=new FileInputStream(file);
//				fis.read(buf);
//				ta.setText("초기화");
//				ta.setText(new String(buf));
//				fis.close();
//			} catch (FileNotFoundException e1) {
//				e1.printStackTrace();
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
		}else if(obj==mi3){
//			FileDialog dia=new FileDialog(this,"저장",FileDialog.SAVE);
//			dia.setVisible(true);
//			File file=new File(dia.getDirectory()+dia.getFile());
//			try {
//				if(!file.exists()){
//					file.createNewFile();
//				}
//				FileOutputStream fos= new FileOutputStream(file);
//				fos.write(ta.getText().getBytes());
//				fos.close();
//				title=(file.getName());
//				setTitle(title);
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
		}else if(obj==mi4){
			dispose();
		}
	}

}
