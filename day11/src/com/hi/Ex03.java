package com.hi;

public class Ex03 {

	public static void main(String[] args) {
		String msg1="abcd";
		String msg2="abcabcda";
		String msg3="";
		String msg4="AaBbCcDd";
		String msg5="              java web    framework    db      ";
		
		//contains
		System.out.println(msg1.contains("bc"));		// ����.contains(���ڰ�) -> �����ν��� ���ڰ��� ���� ������ �ּҰ��� ������ true, false
		
		//startsWith
		System.out.println(msg1.startsWith("ab"));		// �պκп� ""���� ���� true, �ƴϸ� false
		System.out.println(msg1.startsWith("AB"));
		
		//endsWith
		System.out.println(msg1.endsWith("cd"));		// �޺κп� ""���� ���� true, �ƴϸ� false
		System.out.println(msg1.endsWith("cde"));
		
		//isEmpty
		System.out.println(msg3.length()==0);
		System.out.println(msg3.isEmpty());				// ""�ȿ� ���� ��������� true, �ƴϸ� false
		
		//lastIndexOf
		System.out.println(msg2.lastIndexOf('a'));		// ''���� ���������� ���° �ε�������
		System.out.println(msg2.lastIndexOf('a',6));	// ''���� ���������� 0���� ", "�� �� �߿� ���° �ε������� 
		
		//toUpperCase
		System.out.println(msg4.toUpperCase());			// ������ ���� ��� �빮�ڷ�
		
		//toLowerCase
		System.out.println(msg4.toLowerCase());			// ������ ���� ��� �ҹ��ڷ�
		
		//trim
		System.out.println(">>>"+msg5.trim()+"<<<");	// �������� ���۰� ������������ �յ��� ������ �����ش�
		
		//hashCode										//�ؽ��Լ��� ���� �����Ѵ�
	}

}
