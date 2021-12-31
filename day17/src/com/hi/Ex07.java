package com.hi;
// HashSet
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex07 {

	public static void main(String[] args) {
//		HashSet<Integer> set=new HashSet<>();
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1111);
		list.add(3333);
		list.add(1111);
		list.add(2222);
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out. println("--------------------");
//		HashSet<Integer> set =new HashSet<>(list);
		HashSet<Integer> set =new HashSet<>();
		set.addAll(list);
		Iterator<Integer> ite=set.iterator();
		while(ite.hasNext()){
			int temp=ite.next();
			System.out.println(temp);
		}
	}

}
