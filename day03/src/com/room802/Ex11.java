package com.room802;

public class Ex11 {

	public static void main(String[] args) {
		// 조건문 - switch문
		// switch(조건){
		//  case 값:실행문;break;
		//  case 값:실행문;break;
		//  case 값:실행문;break;
		//  ...
		//  default:실행문;
		// }
		// 조건 - value 값
		// 각 case 값(조건x, 연산x, ...)
		// default (if문의 else역할)
		// 조건과 case의 모든 값의 자료형이 일치해야함
		
		int su=1;
		switch(su){
			case 2:
				System.out.println("2입니다");
				break;
			case 1:
				System.out.println("1입니다");
				break;
			case 0:
				System.out.println("0입니다");
				break;
			default :
				System.out.println("2~0사이의 값이 아닙니다");
		}
	}

}
