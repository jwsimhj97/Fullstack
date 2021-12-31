package com.hi;

import java.util.StringTokenizer;
import java.util.Vector;

public class Ex08 {

	public static <E> void main(String[] args) {
		Vector vec=new Vector();
//		System.out.println(vec.firstElement());
		vec.addElement("첫번째");
		vec.addElement("두번째");
		vec.addElement("세번째");
		vec.addElement("네번째");
		
//		vec.setElementAt("3번째",2);
//		vec.insertElementAt("다섯번째", 3);
//		vec.removeElementAt(0);
//		vec.removeElement("3번째");
//		
//		for(int i=0; i<vec.size(); i++){
//			System.out.println(vec.elementAt(i));
//		}
//		System.out.println("-----------------------------");
//		System.out.println(vec.firstElement());
//		System.out.println(vec.firstElement());
//		System.out.println(vec.lastElement());
		
//		System.out.println("-----------------------------");s		
//		vec.addElement("첫번째");
//		vec.insertElementAt("두번째", 0);
//		vec.insertElementAt("세번째", 0);
//		vec.insertElementAt("네번째", 0);
//		
//		while(vec.size()!=0){
//			System.out.println(vec.firstElement());
//			vec.removeElementAt(0);
//		}

		System.out.println("-----------------------------");

		java.util.Enumeration enu=vec.elements();
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
//		vec.iterator();
		java.util.StringTokenizer token=new StringTokenizer("java web framework");
		while(token.hasMoreElements()){
			System.out.println(token.nextToken());
		}
	}

}
