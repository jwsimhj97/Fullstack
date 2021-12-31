package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		// 숫자, 글자(알파벳, 한글), 특수문자
		char ch1='A';
		Character ch2=new Character('A');
		Character ch3=new Character((char)65);
		System.out.println(ch1+"는 유니코드인가"+Character.isDefined(ch1));
		System.out.println(ch1+"는 글자인가"+Character.isAlphabetic(ch1));
		System.out.println(ch1+"는 글자인가"+Character.isLetter(ch1));
		System.out.println(ch1+"는 숫자인가"+Character.isDigit(ch1));
		System.out.println(ch1+"는 띄어쓰기"+Character.isSpace(ch1));
		System.out.println(ch1+"는 "+Character.isWhitespace(ch1));
		System.out.println(ch1+"는 "+Character.isUpperCase(ch1));
		System.out.println(ch1+"는 "+Character.isLowerCase(ch1));
	}

}
