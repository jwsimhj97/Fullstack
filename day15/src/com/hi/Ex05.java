package com.hi;

// 3. 로컬클래스(지역클래스)
class Outter05{
	public static int su1=1111;
	public int su2=2222;
	
	public Outter05(){}
	
	public static void func01(){//(final int su5){
		int su5=5555;		//jdk 1.8부터는 final생략가능
		class Inner05{		// 로컬클래스
			public final static int su3=3333;
			public int su4=4444;
			public Inner05(){}
			public void func03(){
				System.out.println(su5);
			}
		}
//		System.out.println(su5);
//		System.out.println(Inner05.su3);
		Inner05 inn=new Inner05();
		inn.func03();
//		System.out.println(inn.su4);
	}
	public void func02(){
		
	}
}
public class Ex05 {

	public static void main(String[] args) {
//		Outter05.func01(6666);
	}

}
