package com.hi;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// List(ArrayList), Set(HashSet), Map(HashMap)
		// ���׸� : <> (��� ���� ���� ���ϵ��� �����Ѵ�) 1.5~
		ArrayList<String> list=new ArrayList<String>();		// <String> -> add()���� String�� ���
//		ArrayList<String> list=new ArrayList<>();	 => �߷�Ÿ��	���� �ڵ�� ���� 1.7~
			
		list.add("ù��°");
		list.add("�ι�°");
		list.add("����°");
		list.add("�׹�°");
		
		for(int i=0; i<list.size(); i++){
			String msg=list.get(i);
			System.out.println(msg);
		}
	}

}
