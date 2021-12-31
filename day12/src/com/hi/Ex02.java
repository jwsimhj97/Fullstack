package com.hi;
//메서드 오버라이드

class Lec02{
	public int su1=1111;
	public Lec02(){
		System.out.println("부모객체 생성");
	}
	public void func01(){
		su1++;
		System.out.println("부모"+su1);
	}
}

public class Ex02 extends Lec02 {
	public int su1=2222;
	public Ex02(){
		System.out.println("자식객체 생성");
	}
	// 메서드 오버라이드 : 기능을 덮어씌운다
	public void func02(){
		System.out.println("자식");
		func01();
	}

	public static void main(String[] args) {
		Ex02 me=new Ex02();
		System.out.println(me.su1);
		me.func01();
		System.out.println(me.su1);
	}

}
