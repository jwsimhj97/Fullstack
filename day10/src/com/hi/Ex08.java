package com.hi;

public class Ex08 {

	public static void main(String[] args) {
		// 주민번호확인
		char[] temp1={'영', '일', '이', '삼', '사', '오', '육', '칠', '팔', '구'};
		char[] temp2={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		System.out.print("주민번호 >");
		input="구구일이삼일-일일이삼사오육";//sc.nextLine();
		char[] arr=input.toCharArray();			// String -> char[]
		
		
		for(int i=0; i<arr.length; i++){
			char ch=arr[i];
			for(int j=0; j<temp1.length; j++){
				if(ch==temp1[j]){
					arr[i]=temp2[j];
				}
			}
			
		}
		
		
		boolean check1=true;		
		for(int i=0; i<arr.length; i++){
			if(arr[i]=='-'){
				check1=false;
			}
		}
		
		if(check1){
			System.out.println("-를 반드시 입력하세요");
			return;
		}
		if(arr[6]!='-'){
				System.out.println("입력오류");
				return;
		}
		
		char[] arr2=new char[4];
		if(arr[7]<=(int)'2'){
			arr2[0]='1';
			arr2[1]='9';
		}else{
			arr2[0]='2';
			arr2[1]='0';
		}
		System.arraycopy(arr,0,arr2,2,2);		// arr의 0번째, arr2의 2번째를 2길이만큼 복사
		String year=new String(arr2);			// char[] -> String
		int su=Integer.parseInt(year);
		System.out.print("당신은 "+(2021-su+1)+"세 ");
		
		if(arr[7]%2==0){
			System.out.print("여");
		}else{
			System.out.print("남");
		}
		System.out.print("성입니다");
		
		
	}

}
