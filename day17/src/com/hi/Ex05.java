package com.hi;
// ArrayList
import java.util.ArrayList;

public class Ex05 {
	public static ArrayList<?> func(int a, int b){
		if(a%b==0){
			ArrayList<Integer> list=new ArrayList<>();
			list.add(a/b);
			return list;
		}else{
			ArrayList<Double> list=new ArrayList<>();
			list.add(a*100/b/100.0);
			return list;
		}		
	}

	public static void main(String[] args) {
//		ArrayList<?> list=new ArrayList<>();
//		ArrayList<String> list2=(ArrayList<String>) list;
//		list2.add(1111);
//		list2.add("java");
		ArrayList<Integer> list=(ArrayList<Integer>) func(6,2);
		ArrayList<Double> list2=(ArrayList<Double>) func(5,2);
	}

}
