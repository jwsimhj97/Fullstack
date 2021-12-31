package com.room802;

public class Ex03 {

	public static void main(String[] args) {
		//자동형변환
		//byte < short < char < int < long < float < double
		// 사칙연산(+ - * / %)
		int a;
		int b;
		a=4;
		b=1;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);	//동일자료형의 연산은 동일 자료형을 반환
		System.out.println(a%b);	//나머지 반환
		
		System.out.println(1+(2+3)*2-1);
	}

}
