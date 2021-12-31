package com.hi;

public class Ex02 {

	public static void main(String[] args) {
		// 10정수 타입
		int su1=1111;
		Integer su2=new Integer(2222);
		Integer su3=new Integer("2222");	// 앞에 +,- 부호 인정
		System.out.println(su2==su3);
		System.out.println(su2.equals(su3));
		System.out.println(su2+1);
		System.out.println(su3+1);
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);	// int의 최소값 ~ 최대값
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.parseInt("1234"));
		int su4=Integer.parseInt("4444");
		Integer su5=Integer.valueOf("5555");;
		Integer su6=128;
		System.out.println(su6.byteValue());
		
		int su7=16;
		System.out.println(su7+"의 2진수="+Integer.toBinaryString(su7));
		System.out.println(su7+"의 8진수="+Integer.toOctalString(su7));
		System.out.println(su7+"의 16진수="+Integer.toHexString(su7));
		System.out.println(Integer.reverse(su7));
		System.out.println(Integer.compare(1000, 10));	// 앞의 수가 크면 1, 작으면 -1, 같으면 0
	}

}
