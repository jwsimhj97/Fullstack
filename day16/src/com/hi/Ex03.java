package com.hi;

import java.util.Date;

// Class Date
public class Ex03 {

	public static void main(String[] args) {
		java.util.Date cal=new Date();
//		cal.setYear(2002-1900);	// ����
		cal.setMonth(11-1);
		cal.setDate(29);
		cal.setHours(9);
		cal.setMinutes(30);
		
		System.out.println(cal);
		System.out.println(cal.getYear()+1900);
		System.out.println(cal.getMonth());
		System.out.println(cal.getDate());
		System.out.println(cal.getHours());
		System.out.println(cal.getMinutes());
		System.out.println(cal.getSeconds());
		System.out.println(cal.getTime());
		System.out.println((System.currentTimeMillis()-cal.getTime())/1000/60/60/24);
		
	}

}
