package com.hi;

public class Ex08 {
	public static int su1=0;
	public int su2=0;

	public static void main(String[] args) {
		for(int i=0; i<3; i++){
//			func01();
			Ex08 me=new Ex08();
			me.func02();			
		}
	}
	
	public static void func01(){
		System.out.println(su1);
		su1++;
		System.out.println(su1);
		su1++;
		System.out.println(su1);
	}
	
	public void func02(){
		System.out.println(su2);
		su2++;
		System.out.println(su2);
		su2++;
		System.out.println(su2);
	}

}
