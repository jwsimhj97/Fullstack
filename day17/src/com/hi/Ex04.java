package com.hi;

class Lec04<T1,T2>{
	T1 obj1;
	T2 obj2;
	public void setObj(T1 obj1, T2 obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public void printObj(){
		System.out.println(obj1.getClass());
		System.out.println(obj2.getClass());
	}
}

public class Ex04 {

	public static void main(String[] args) {
		double obj1=1111;
		StringBuffer obj2=new StringBuffer("java");
		
		Lec04<Integer,String> lec=new Lec04();
//		lec.setObj(obj1, obj2);
		lec.printObj();
	}

}
