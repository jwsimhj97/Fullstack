package com.hi;

public class Ex02 {

	public static void main(String[] args) {
		// 10���� Ÿ��
		int su1=1111;
		Integer su2=new Integer(2222);
		Integer su3=new Integer("2222");	// �տ� +,- ��ȣ ����
		System.out.println(su2==su3);
		System.out.println(su2.equals(su3));
		System.out.println(su2+1);
		System.out.println(su3+1);
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);	// int�� �ּҰ� ~ �ִ밪
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.parseInt("1234"));
		int su4=Integer.parseInt("4444");
		Integer su5=Integer.valueOf("5555");;
		Integer su6=128;
		System.out.println(su6.byteValue());
		
		int su7=16;
		System.out.println(su7+"�� 2����="+Integer.toBinaryString(su7));
		System.out.println(su7+"�� 8����="+Integer.toOctalString(su7));
		System.out.println(su7+"�� 16����="+Integer.toHexString(su7));
		System.out.println(Integer.reverse(su7));
		System.out.println(Integer.compare(1000, 10));	// ���� ���� ũ�� 1, ������ -1, ������ 0
	}

}
