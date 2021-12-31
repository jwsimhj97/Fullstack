package com.hi;

public class Ex03 {
	
	public Ex03 func(){
		System.out.println("실행");
		return this;
	}
	
	public int func2(int su){
		System.out.println("실행");
		if(su==0){
			return 0;
		}else{
			su--;
			return func2(su);
		}
	}

	public static void main(String[] args) {
		Ex03 me=new Ex03();
//		me.func().func().func();
		me.func2(5);
	}

}
