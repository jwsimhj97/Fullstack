package com.hi;
// 자바의 장점 - 다형성

class Lec04{
	public int su1=1111;
	public void func01(){
		System.out.println("부모클래스의 기능1");
	}
	public void func03(){
		System.out.println("부모클래스의 기능3");
	}
}

public class Ex04 extends Lec04{
//	public int su1=2222;
//	public int su2=3333;
	
	public void func01(){
		System.out.println("자식클래스의 기능1");
	}
	public void func02(){
		System.out.println("자식클래스의 기능2");
	}

	public static void main(String[] args) {
		// 자바의 장점 - 다형성
		Lec04 var1=new Lec04();
		System.out.println(var1.su1);
		var1.func01();
		var1.func03();
		
		Ex04 var2=new Ex04();
		System.out.println(var2.su1);
//		System.out.println(var2.su2);
		var2.func01();
		var2.func02();
		var2.func03();
		
//		Ex04 me=new Lec04();	// 불가능
		Lec04 var3;
		var3=new Lec04();
		var3=new Ex04();
		System.out.println(var3.su1);
		var3.func01();
//		var3.func02();			// Lec04에는 func02();가 없기때문에 사용 불가능
		var3.func03();
	}

}
