package com.hi;

import java.util.StringTokenizer;
import java.util.Vector;

public class Ex08 {

	public static <E> void main(String[] args) {
		Vector vec=new Vector();
//		System.out.println(vec.firstElement());
		vec.addElement("ù��°");
		vec.addElement("�ι�°");
		vec.addElement("����°");
		vec.addElement("�׹�°");
		
//		vec.setElementAt("3��°",2);
//		vec.insertElementAt("�ټ���°", 3);
//		vec.removeElementAt(0);
//		vec.removeElement("3��°");
//		
//		for(int i=0; i<vec.size(); i++){
//			System.out.println(vec.elementAt(i));
//		}
//		System.out.println("-----------------------------");
//		System.out.println(vec.firstElement());
//		System.out.println(vec.firstElement());
//		System.out.println(vec.lastElement());
		
//		System.out.println("-----------------------------");s		
//		vec.addElement("ù��°");
//		vec.insertElementAt("�ι�°", 0);
//		vec.insertElementAt("����°", 0);
//		vec.insertElementAt("�׹�°", 0);
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
