package com.hi;
// ItemListener

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;

public class Ex01 extends Frame implements ItemListener{
	Choice cho;		// Choice cho 필드로 뺌
	List list;
	Checkbox cb1, cb2, cb3;
	
	public Ex01(){
		Panel p=new Panel();
		
		list=new List();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		list.addItemListener(this);
//		p.add(list);
		
		cho=new Choice();
		cho.add("item1");	// = cho.addItem("item1");
		cho.add("item2");
		cho.add("item3");
		cho.add("item4");
		cho.addItemListener(this);
//		p.add(cho);
		
		CheckboxGroup cbg=new CheckboxGroup();
		cb1=new Checkbox("item1",false,cbg);
		cb1.addItemListener(this);
		p.add(cb1);
		cb2=new Checkbox("item2",false,cbg);
		cb2.addItemListener(this);
		p.add(cb2);
		cb3=new Checkbox("item3",false,cbg);
		cb3.addItemListener(this);
		p.add(cb3);
		
		add(p);
		setBounds(100,100,500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("cb1:"+cb1.getState());
		System.out.println("cb2:"+cb2.getState());
		System.out.println("cb3:"+cb3.getState());
		
//		int[] arr1=list.getSelectedIndexes();
//		String[] arr2=list.getSelectedItems();
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
		
//		System.out.println("새로운 아이템 선택");
		
//		System.out.println(list.getSelectedIndex());	// list
//		System.out.println(list.getSelectedItem());		
//		System.out.println(cho.getSelectedIndex());		// choice
//		System.out.println(cho.getSelectedItem());
	}

}
