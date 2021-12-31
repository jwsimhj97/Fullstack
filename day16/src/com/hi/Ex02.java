package com.hi;

import java.util.Calendar;
import java.util.GregorianCalendar;

//Class GregorianCalendar 
public class Ex02 {

	public static void main(String[] args) {
//		java.util.GregorianCalendar cal=new GregorianCalendar();
		java.util.GregorianCalendar cal=new GregorianCalendar(2002,4,1);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
	}

}
