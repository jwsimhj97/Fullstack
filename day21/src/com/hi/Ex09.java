package com.hi;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex09 extends Frame{
	
	public Ex09(){
		Panel p=new Panel();
		Color c=Color.GREEN;
		Font f=new Font(Font.SERIF, Font.ITALIC, 22){};
//		Color c=new Color(255,0,0);		
//		p.setBackground(c);
//		Font f=new Font();;
//		Font f=new Font("굴림체", 12, 0); // Font(font, size, opacity)
		
		
		Label la1=new Label("글씨");
		la1.setText("작성");
		la1.setBackground(c);
		la1.setFont(f);
		p.add(la1);
		
//		Button btn1=new Button("제목없음");
//		btn1.setLabel();
//		btn1.setFont(f);
//		btn1.setBackground(c);
//		p.add(btn1);
		
//		TextField tf1=new TextField("",5);
//		tf1.setEchoChar('@');	// setEchoChar() - ()안의 문자로 입력시 출력되어보임(password할때 주로 사용)
////		tf1.setText("aaaaa");
//		p.add(tf1);
		
//		TextArea ta1=new TextArea("디폴트텍스트",3,10,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
//		p.add(ta1);
		
//		java.awt.CheckboxGroup chg=new CheckboxGroup();
//		java.awt.Checkbox ckb1=new Checkbox("항목1",false,chg);
//		ckb1.setLabel("항목1");
//		ckb1.setState(true);
//		p.add(ckb1);
		
//		java.awt.Choice cho1=new Choice();	// select느낌
//		cho1.addItem("item1");
//		cho1.addItem("item2");
//		cho1.addItem("item3");
//		cho1.addItem("item4");
//		p.add(cho1);
////		cho1.select(2);
//		cho1.select("item2");
//		System.out.println(cho1.getSelectedIndex());
//		System.out.println(cho1.getSelectedItem());
		
		List list1=new List(3);
		list1.add("item1");
		list1.add("item2");
		list1.add("item3");
		list1.add("item4");
		list1.add("item5");
		p.add(list1);
		list1.select(2);
		System.out.println(list1.getItem(1));
		System.out.println(list1.getSelectedIndex());
		System.out.println(list1.getSelectedItem());
		int[] arr1=list1.getSelectedIndexes();
		String[] arr2=list1.getSelectedItems();
		
		add(p);
		setLocation(100, 100);
		setSize(400, 300);
		setVisible(true);
		
		System.out.println(p.getWidth()+","+p.getHeight());
	}

	public static void main(String[] args) {
		new Ex09();
	}

}
