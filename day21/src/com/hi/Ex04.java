package com.hi;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex04 extends Frame{
	
	public Ex04(){	// â ����		
		java.awt.Button btn1=new Button();
		btn1.setLabel("��ư �۾�");		
		
		Button btn2=new Button();
		btn2.setLabel("���ο� ��ư2");
		
		Button btn3=new Button();
		btn3.setLabel("���ο� ��ư3");
		
		Button btn4=new Button();
		btn4.setLabel("���ο� ��ư4");

		Button btn5=new Button();
		btn5.setLabel("���ο� ��ư5");

//		FlowLayout layout=new FlowLayout();	// ��ġ������ - ��ġ�ϴ� ����
		java.awt.GridLayout layout=new GridLayout(3,3);	// GridLayout(, ) - �ص޺κ��� �켱������ �ƴϱ⶧���� ��ư���� �þ�� �պκ��� �������� �þ��
		
		java.awt.Panel pan1=new Panel();
		pan1.setLayout(layout);
		pan1.add(btn1);
		pan1.add(btn2);
		pan1.add(btn3);
		pan1.add(btn4);
		pan1.add(btn5);
		add(pan1);		
		
		setLocation(200,200);	// â ��ġ
		setSize(500,300);		// â ������
		setVisible(true);		// ȭ�鿡 �������� ����
	}

	public static void main(String[] args) {
		new Ex04();
	}

}
