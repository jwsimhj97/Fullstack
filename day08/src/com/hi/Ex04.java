package com.hi;

public class Ex04 {
//	public final int su;
	public int su3=4321;
	public static final int su5=5555;
//	public static final int su6;	//final은 값을 못바꿈=>고정값이 있어야한다.
	
	public Ex04(int su2){	//생성자
		su3=su2;				//필드값의 초기화 //su는 Ex04에 받는 int su2의 값을 넣는다
		//su3=3333;				이런식으로 필드값의 초기화값을 직접 넣어주는것이 좋다
	}

	public static void main(String[] args) {
		final int su4;		//final - 값을 바꾸지 못하는 변수에 사용	//su4는 상수형변수
		su4=4444;
//		su4=5555;
		System.out.println(su4);
		
		Ex04 me=new Ex04(1234);		
//		System.out.println(me.su);
		System.out.println(me.su3);
//		me.su3=54321;
//		su5=6666;
	}

}
