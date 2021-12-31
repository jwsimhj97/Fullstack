package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		// Set = 집합의 개념 | Set은 중복값을 허용하지 않는다
//		java.util.Set set=new java.util.HashSet();	// HashSet - 중복검사를 한다
		java.util.Set set=new java.util.TreeSet();	// TreeSet - 자동으로 중복검사, sort(순차적정렬)역할을 한다
//		set.add("첫번째");
//		set.add("두번째");
//		set.add("세번째");
//		set.add("네번째");
		
		set.add(4444);
		set.add(2222);
		set.add(1111);
		set.add(3333);
		
		System.out.println("size:"+set.size());	// 갯수
		
		java.util.Iterator ite=set.iterator();	// iterator - 반복자. 배열이나 그와 유사한 자료 구조의 내부의 요소를 순회(traversing)하는 객체
		while(ite.hasNext()){					// hasNext - 뒤에 알려줄 정보가 있으면 true 없으면 false
			System.out.println(ite.next());
		}
		
//		java.util.Iterator ite2=set.iterator();
//		while(ite2.hasNext()){
//			System.out.println(ite2.next());
//		}
	}

}
