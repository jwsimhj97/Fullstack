package com.hi;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex04 extends Frame{
	
	public Ex04(){	// 창 생성		
		java.awt.Button btn1=new Button();
		btn1.setLabel("버튼 글씨");		
		
		Button btn2=new Button();
		btn2.setLabel("새로운 버튼2");
		
		Button btn3=new Button();
		btn3.setLabel("새로운 버튼3");
		
		Button btn4=new Button();
		btn4.setLabel("새로운 버튼4");

		Button btn5=new Button();
		btn5.setLabel("새로운 버튼5");

//		FlowLayout layout=new FlowLayout();	// 배치관리자 - 배치하는 역할
		java.awt.GridLayout layout=new GridLayout(3,3);	// GridLayout(, ) - ※뒷부분은 우선순위가 아니기때문에 버튼수가 늘어나면 앞부분을 기준으로 늘어난다
		
		java.awt.Panel pan1=new Panel();
		pan1.setLayout(layout);
		pan1.add(btn1);
		pan1.add(btn2);
		pan1.add(btn3);
		pan1.add(btn4);
		pan1.add(btn5);
		add(pan1);		
		
		setLocation(200,200);	// 창 위치
		setSize(500,300);		// 창 사이즈
		setVisible(true);		// 화면에 보여줄지 결정
	}

	public static void main(String[] args) {
		new Ex04();
	}

}
