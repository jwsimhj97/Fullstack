package com.hi;

public class Ex07 {

	public static void func01(int a) throws Exception{
		String[] arr={"a", "ab", "abc", "abcd"};
		Exception ex=new Exception();
		
//		try{
//			if(a>-1){throw ex;}
			System.out.println(arr[a]);
//		}catch(Exception e){
//			System.out.println("����ȸ�� in");
//		}
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		try{
			func01(3);
		}catch(Exception e){
			System.out.println("����ȸ�� out");
		}
		System.out.println("main end");
	}

}
