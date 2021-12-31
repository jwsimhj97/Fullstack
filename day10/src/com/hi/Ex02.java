package com.hi;

public class Ex02 {

	public int su=1111;
	
	public void func01(){
		System.out.println(su);
	}
	
	public void func02(){
		su++;
		func01();
	}
	
	public void func03(){
		su++;
		Ex02 me=new Ex02();
		me.func01();
	}
	
	
	public static void main(String[] args) {
		Ex02 me=new Ex02();
		me.func03();
	}

}
