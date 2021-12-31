package com.hi;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// List(ArrayList), Set(HashSet), Map(HashMap)
		// 제네릭 : <> (모든 값이 들어가지 못하도록 제어한다) 1.5~
		ArrayList<String> list=new ArrayList<String>();		// <String> -> add()값을 String만 허용
//		ArrayList<String> list=new ArrayList<>();	 => 추론타입	위의 코드와 동일 1.7~
			
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.add("네번째");
		
		for(int i=0; i<list.size(); i++){
			String msg=list.get(i);
			System.out.println(msg);
		}
	}

}
