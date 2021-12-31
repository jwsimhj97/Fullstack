package com.hi;
// 접근제한자 public > protected >= default > private 

class Lec10{
	public static int su1=1111;		// public  - 모두 접근허용
	static int su2=2222;			// default - 동일패키지 내부에서만 접근허용
	private static int su3=3333;	// private - (해당클래스내부에서만 사용)
	protected static int su4=4444;	// protected - 다른패키지이더라도 상속을 통해서는 접근허용/동일패키지 내부에서만 접근허용(default와 동일)

	// 디자인패턴 (싱글톤 패턴)
	private static Lec10 me=new Lec10();
	
	private Lec10(){}				// 객체생성 x
	
//	public static Lec10 getInstance(){	// getInstance
//		return new Lec10();
//	}
	
	public static Lec10 newInstance(){	// newInstance
		return me;
	}
	
	public static void func1(){
		System.out.println(su3);
	}
	static void func02(){}
	private static void func03(){}
}

public class Ex10 extends com.bit.Ex10{

	public static void main(String[] args) {
		// 접근제한자
		Ex10 me=new Ex10();
		System.out.println(me.su1);
//		System.out.println(me.su2);
//		System.out.println(me.su3);
		System.out.println(me.su4);

		System.out.println("--------------------------------------");
		System.out.println(Lec10.su1);
		System.out.println(Lec10.su2);
//		System.out.println(Lec10.su3);
		System.out.println(Lec10.su4);

		System.out.println("--------------------------------------");
		System.out.println(com.bit.Ex10.su1);
//		System.out.println(com.bit.Ex10.su2);
//		System.out.println(com.bit.Ex10.su4);
		
		System.out.println("--------------------------------------");
		com.bit.Ex10 you;
		Lec10 you2;
//		you2=new Lec10();
		you2=Lec10.newInstance();
		System.out.println(you2);
//		you2=new Lec10();
		you2=Lec10.newInstance();
		System.out.println(you2);
	}

}


