package com.hi;

import java.util.ArrayList;
import java.util.Arrays;
// Class ArrayList
public class Ex05_1 {

	public static void main(String[] args) {
		java.util.ArrayList list=new ArrayList();
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(4);
		
		list.remove(1);		//  -> 	Integer : Wrapper 클래스임 => 한 객체를 의미 / null로 초기화 가능 
							// 					int : primitive 자료형임(long, float, double 등등...)
		
		for(int i=0; i<list.size(); i++){
			Object msg=list.get(i);
		}
	}

}
