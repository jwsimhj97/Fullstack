package com.hi;

public class Ex01 {

	public static void main(String[] args) {
		// ���ڿ�
		String st1=null;	// null - ��ü�� �ƴϴ�
		st1="";				// ���ڰ� ���� ���ڿ��� ��ü
		st1=new String();
		
		
		// ���ڿ��� �� equals�޼���		
		st1="java";
		String st2="java";
		System.out.println(st1.equals(st2));
		
		char[] arr1=st2.toCharArray();
		String st3=new String(arr1);

		byte[] arr2=st2.getBytes();
		String st4=new String(arr2);
	}

}
