package com.hi;

// 2. non-static 내부클래스(인스턴스 [내부]클래스)
class Outter04{
	public static int su1=1111;
	public int su2=2222;
	public Outter04(){
		
	}
	public static void func01(){
		Outter04 outt=new Outter04();
		Inner04 inn=outt.new Inner04();
		System.out.println(inn.su2);	//4444
	}
	public void func02(){
		Inner04 inn=new Inner04();
		System.out.println(inn.su2);	//4444
	}
	
	class Inner04{		// non-static안에 static사용 불가
		public final static int su3=3333;	//non-static클래스에서 static 예외적 허용 - final을 붙이면 상수형변수가된다
		public int su2=4444;
		
		public Inner04(){}
		
//		public static void func03(){}
		
		public void func04(){
			System.out.println(su1);	//1111
			System.out.println(this.su2);	//4444	this.su2
			
		}
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Outter04 outt=new Outter04();
//		Inner04 inn=outt.new Inner04();
//		System.out.println(inn.su2);

	}

}
