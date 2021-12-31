package com.hi;

class Ex33{
	int a=1111;
//	public Ex33(){}  -> default생성자()가 자동으로 만들어져있음
}

class Ex333{
	int b=2222;
	
	public Ex333(){
		System.out.println("생성자 호출");
	}
}

class Ex3333{
	int c=3333;
	public Ex3333(int su){
		c=su;
		System.out.println(c+"r값을 매개변수로 받는 생성자");
	}
}

public class Ex03 {

	public static void main(String[] args) {
		java.io.InputStream is=System.in;
		java.util.Scanner sc;
		// 클래스의 구성요소
		// 1. 메서드
		// 2. 전역변수
		// 3. 생성자 -> 없으면 default생성자()를 자동으로 만든다
		// public 클래스명([매개변수]){수행할 코드;}
		Ex33 ex33;			//변수의 선언
		ex33=null;			//초기화
		ex33=new Ex33();	
		
		
		
		Ex333 ex333=new Ex333();
//		Ex3333 ex3333=new Ex3333();
		Ex3333 ex3333=new Ex3333(1234);
	}

}
