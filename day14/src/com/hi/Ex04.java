package com.hi;

public class Ex04 {

	public static void main(String[] args) {
		// 10진수 실수타입
		double su1=3.14;
		Double su2=new Double(3.14);
		Double su3=new Double("3.14");
		System.out.println(su3);
		System.out.println(Double.MAX_VALUE);	//E -> 10의 308승
		System.out.println(su2.intValue());
		System.out.println(Double.parseDouble("3.14"));
		
		Double su4=2.0/1.0;
		System.out.println(su4.isInfinite());
		System.out.println(su4.isNaN());
		
		Float su5=new Float(3.14);
		Float su6=new Float(3.14F);
		Float su7=new Float("3.14");
	}

}
