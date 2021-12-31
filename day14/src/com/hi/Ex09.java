package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		long before=System.currentTimeMillis();
		for(int i=0; i<100000; i++){
			Ex09 me=new Ex09();
		}
		long after=System.currentTimeMillis();
		System.out.println(before);
		// "\r\n";
		// "\n";
		String newLine=System.lineSeparator();
		System.out.println(after);
		System.out.println(after-before);
	}

}
