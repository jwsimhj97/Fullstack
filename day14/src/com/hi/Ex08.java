package com.hi;

public class Ex08 implements Cloneable{
	int su=1;
	
	public Ex08(int su){
		this.su=su;
	}
	public static void main(String[] args) {
		// Object
		Object obj1=new Object();
		Ex08 me=new Ex08(1);
		Ex08 you=new Ex08(1);
		System.out.println(me==you);
		System.out.println(me.equals(you));
		System.out.println(me.toString());
		System.out.println(me.hashCode());
		try{
			Object me2=me.clone();		// clone - ∞¥√º∫π¡¶(±Ì¿∫∫πªÁ)
			System.out.println(me2);
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}
	
	public boolean equals(Object obj){
		return su==((Ex08)obj).su;
	}
}
