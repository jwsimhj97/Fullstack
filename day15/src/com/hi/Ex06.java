package com.hi;

interface Inter{
	void func02();
}
class Lec05{
	public static Inter func(){
		// 익명클래스 (이름이 없는 클래스)
		return new Inter(){
			public void func02(){		// 로컬클래스를 호출
				System.out.println("익명클래스 기능");
			}
		};
	}
}
public class Ex06 {

	public static void main(String[] args) {
		Inter inter=Lec05.func();
		inter.func02();
	}

}


//위의 내용 단순하게 줄임
//interface Inter{
//	void func02();
//}
//public class Ex06 {
//
//	// 익명클래스 (이름이 없는 클래스)
//	public static void main(String[] args) {
//		Inter inter=new Inter(){
//			public void func02(){		// 로컬클래스를 호출
//				System.out.println("익명클래스 기능");
//			}
//		};
//		inter.func02();
//	}
//
//}




//interface Inter{
//	void func02();
//}
//abstract class Lec06{
//	public void func01(){}
//	public abstract void func02();		// 오버라이드
//}
//
//public class Ex06 {
//
//	// 익명클래스 (이름이 없는 클래스)
//	public static void main(String[] args) {
//		Lec06 inter=new Lec06(){
//			public void func02(){		// 오버라이드
//				System.out.println("익명클래스 기능");
//			}
//		};
//		inter.func01();
//		inter.func02();
//	}
//
//}
