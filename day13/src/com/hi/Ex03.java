package com.hi;

abstract class Lec03{
	public Lec03(int a){
		super();
	}
}

public class Ex03 extends Lec03{

	public Ex03(){	//default생성자의 제한자는 public이다
		super(1111);
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
