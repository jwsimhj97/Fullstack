package com.hi;

//call method
//static -> static				클래스명.메서드명();
//static -> non-static			참조변수.메서드명();
//non-static -> non-static		this.메서드명();
//non-static -> static			클래스명.메서드명();


public class Ex02 {
	public static void func01(){
		System.out.println("static method func01...");
		Ex02 me=new Ex02();
		me.func02();
	}
	public void func02(){
		System.out.println("non-static method func02...");
		this.func03();
		func01();
		return;
	}
	public void func03(){
		System.out.println("non-static method func03...");
	}

	public static void main(String[] args) {
		func01();
		Ex02 me;		//변수의 선언 
		me=new Ex02();	//참조변수 - 객체생성
		me.func02();		//참조변수.메서드명() 호출
		Ex02 me2=new Ex02();
		me2.func03();
		me2.func02();
	}

}
