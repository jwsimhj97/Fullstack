package com.hi;

class Lec06{
	public int su=1111;
	public Lec06(int a){
		super();
		System.out.println("부모생성"+a);
	}
	
	public void func(){
		System.out.println("부모클래스의 기능");
	}
}

public class Ex06 extends Lec06{
	public int su=2222;
	public Ex06(){
		super(1234);		// this는 생성자에 매개변수값이 없어도 default값이 자동으로 들어가졌는데, super은 반드시 default값을 정해주어야한다.
		System.out.println("자식생성");
	}
	public void func(){
		System.out.println("자식클래스의 기능"+super.su);
		super.func();	// super(=this같은 기능) - 부모의 참조변수
	}

	public static void main(String[] args) {
		Ex06 me=new Ex06();
		me.func();
	}

}
