package com.room802;

public class Ex15 {
	public static int myParse(String msg){
		char[] arr=msg.toCharArray();
		int sum=0;
		int temp=1;
		
		for(int i=0; i<arr.length; i++){
			sum+=(arr[arr.length-1+i]-48)*temp;	// 3 2 1 0			
			temp=temp*10;
		}
//		arr.length
//		arr[0]-48;	//'1' 49
		return sum;
	}

	public static void main(String[] args) {
		// 문자열을 숫자로 변환
		String msg="1234";
		int su=Integer.parseInt(msg);
		System.out.println(su+1);
	}

}
