package com.hi;

public class Ex12 {

	public static void main(String[] args) {
		// crud
		StringBuilder msg=new StringBuilder("abcd");	//StringBuffer = StringBuilder ���� �Ȱ���
		System.out.println(msg.append("efg"));			//msg�� efg�� ���δ�
		System.out.println(msg.insert(3, "ABC"));		//msg�� 3�� �ڸ��� ABC�� �ִ´�
		System.out.println(msg.replace(3, 6, "123"));	//msg�� 3�ڸ����� 6�ڸ����� 123�� �ִ´�
		System.out.println(msg.delete(3, 6));			//msg�� 3�ڸ����� 6�ڸ������� �����Ѵ�
	}

}
