package com.hi;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg1="java";
		StringBuffer msg2=new StringBuffer("java");	// �ڱ� �ڽ��� ���� ���Ѵ� StringBuffer()���� ()���� ���� default�� 16�̴�
		msg2.append("Web");
		System.out.println(msg2);
		
		StringBuffer msg3;
//		System.out.println(msg3);
		System.out.println(msg2);
		
		StringBuffer msg6=new StringBuffer(100000);
		for(int i=0; i<13; i++){
			msg6.append("a");
			System.out.println(msg6.capacity());
		}
		
		msg6.trimToSize();
		System.out.println(msg6.capacity());
	}

}
