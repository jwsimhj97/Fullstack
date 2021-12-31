package com.hi;
// this
// 참조변수 자기자신의 역할
// 자기자신을 지칭할 경우 생략가능(컴파일과정에서 자동생성)
// 오직 non-static에서만 사용가능

public class Ex01 {
	public static int su1=1111;
	public int su2=2222;
	
	public Ex01(){
		
	}
	
	public static void func01(){
		com.hi.Ex01 me=new com.hi.Ex01();
		me.func03();
	}
	
	public void func02(com.hi.Ex01 me){
		me.func03();
		this.func03();	//참조변수 me(=this)가 생략되어있다.
		System.out.println(me==this);
		Ex01 you=new Ex01();
		you.func03();
	}
	
	public void func03(){
		// 지역변수와 전역변수가 동일명으로 동시존재시 우선순위 => 지역
		int su1=4444;
		int su2=3333;
		System.out.println(su2);		// 3333
		System.out.println(this.su2);	// 2222
		System.out.println(su1);		// 4444
		System.out.println(Ex01.su1);	// 1111
	}

	public static void main(String[] args) {
		com.hi.Ex01.func01();
		com.hi.Ex01 me=new Ex01();
		me.func02(me);
		
	}

}
