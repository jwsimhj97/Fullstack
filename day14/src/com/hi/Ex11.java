package com.hi;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg1="java";
		StringBuffer msg2=new StringBuffer("java");	// 자기 자신의 값이 변한다 StringBuffer()에서 ()안의 빈값의 default는 16이다
		msg2.append("Web");
		System.out.println(msg2);
		
		StringBuffer msg3;
//		System.out.println(msg3);
		System.out.println(msg2);
		
		StringBuffer msg6=new StringBuffer(100000);
		for(int i=0; i<13; i++){
			msg6.append("a");
			System.out.println(msg6.capacity());
		}
		
		msg6.trimToSize();
		System.out.println(msg6.capacity());
	}

}
