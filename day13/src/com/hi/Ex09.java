//����ó�� finally
package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		System.out.println("main start");
		String[] arr={"a", "ab", "abc"};
		try{
			int su=1;
			System.out.println(arr[su]);
			return;
//		}catch(Exception e){
			
		}finally{		// ���������� ������ ���Ѵ�
			System.out.println("main end");
		}
	}

}
