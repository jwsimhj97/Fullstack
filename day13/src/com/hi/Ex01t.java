package com.hi;

// 추상클래스
// 추상 메서드를 0개 이상 갖는 클래스
// 상속을 통해서만 사용가능하게 하고싶은 클래스를 만드는 방법
abstract class Lec01{
	int su=1111;
	
	// 추상메서드 - 선언(o), 구현(x)
	// 객체생성이 안됨
	abstract void func01();
//	void func02(){}
	void func03(){
		System.out.println("func03 run...");
	}
}
public class Ex01t extends Lec01 { 
	void func01(){
		System.out.println("오버라이드된 메서드");
	}

	public static void main(String[] args) {
//		Lec01 lec=new Lec01();
//		lec.func01();
		Ex01t me=new Ex01t();
		me.func03();
		me.func01();
		
	}

}
