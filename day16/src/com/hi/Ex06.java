package com.hi;

import java.util.LinkedList;
// LinkedList - �迭�� ����ؼ� List�� ������ Ŭ����
public class Ex06 {

	public static void main(String[] args) {
		java.util.LinkedList list=new LinkedList();
		list.add("ù��°");
		list.add("�ι�°");
		list.add("����°");
		list.add("�׹�°");
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}

}
