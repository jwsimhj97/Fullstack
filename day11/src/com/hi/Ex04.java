package com.hi;

public class Ex04 {

	public static void main(String[] args) {
//		Ex04 me=new Ex04();
//		System.out.println(me);		// 출력되는 값이 hashcode값
		
		//split
		String msg="java|web|db|framework|app";
		String[] arr=msg.split("\\|");				// ""을 기준으로 나눠준다(각각의 문자열배열로)
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		System.out.println("-------------------------------");
		
		//compareTo - 같은지 다른지, 다르면 얼마나 다른지 리턴(char단위로 확인)
		String msg1="abcadakkkkkk";
		String msg2="abcda";
		System.out.println(msg1.compareTo(msg2));	// 앞의 값과 뒤의 값의 차이가 얼마나 나는지(같으면 0)
		System.out.println(func(msg1, msg2));	
	}
	
	public static int func(String a, String b){
		if(a.length()==b.length()){
			char[] arr1=a.toCharArray();
			char[] arr2=b.toCharArray();
			for(int i=0; i<a.length(); i++){
				if(arr1[i]-arr2[i]!=0){
					return arr1[i]-arr2[i];
				}
			}
			return 0;
		}else{
			return a.length()-b.length();
		}
	}

}
