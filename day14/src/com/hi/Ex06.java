package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		// ����, ����(���ĺ�, �ѱ�), Ư������
		char ch1='A';
		Character ch2=new Character('A');
		Character ch3=new Character((char)65);
		System.out.println(ch1+"�� �����ڵ��ΰ�"+Character.isDefined(ch1));
		System.out.println(ch1+"�� �����ΰ�"+Character.isAlphabetic(ch1));
		System.out.println(ch1+"�� �����ΰ�"+Character.isLetter(ch1));
		System.out.println(ch1+"�� �����ΰ�"+Character.isDigit(ch1));
		System.out.println(ch1+"�� ����"+Character.isSpace(ch1));
		System.out.println(ch1+"�� "+Character.isWhitespace(ch1));
		System.out.println(ch1+"�� "+Character.isUpperCase(ch1));
		System.out.println(ch1+"�� "+Character.isLowerCase(ch1));
	}

}
