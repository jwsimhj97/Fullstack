package com.hi;
// Class random

public class Ex07 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		java.util.Random ran=new java.util.Random();
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextInt());
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextInt(3));
	}

}
