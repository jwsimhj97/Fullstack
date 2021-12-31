package com.hi;

public class Ex05 {

	public static void main(String[] args) {
		boolean boo1=true;
		Boolean boo2=new Boolean(true);
		Boolean boo3=new Boolean(Boolean.TRUE);
		Boolean boo4=new Boolean("true");
		Boolean boo5=new Boolean("TURE");
		Boolean boo6=new Boolean("Ture");
		Boolean boo7=new Boolean("");
		System.out.println(boo7);
	}

}
