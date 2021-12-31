package com.bit;

public class Ex10 {
	
	public static int su1=1000;
	static int su2=2000;			// default
	private static int su3=3000;	// private(해당클래스내부에서만 사용)
	protected int su4=4000;			// protected
	
	public Ex10(){}
	
	public static void func(){
		System.out.println(su3);
	}

}
