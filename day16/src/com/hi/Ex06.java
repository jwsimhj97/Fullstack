package com.hi;

import java.util.LinkedList;
// LinkedList - 배열을 사용해서 List를 구현한 클래스
public class Ex06 {

	public static void main(String[] args) {
		java.util.LinkedList list=new LinkedList();
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.add("네번째");
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}

}
