package com.hi;

public class Ex04 {

	public static void main(String[] args) {
//		Ex04 me=new Ex04();
//		System.out.println(me);		// ��µǴ� ���� hashcode��
		
		//split
		String msg="java|web|db|framework|app";
		String[] arr=msg.split("\\|");				// ""�� �������� �����ش�(������ ���ڿ��迭��)
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		System.out.println("-------------------------------");
		
		//compareTo - ������ �ٸ���, �ٸ��� �󸶳� �ٸ��� ����(char������ Ȯ��)
		String msg1="abcadakkkkkk";
		String msg2="abcda";
		System.out.println(msg1.compareTo(msg2));	// ���� ���� ���� ���� ���̰� �󸶳� ������(������ 0)
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
