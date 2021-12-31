package com.hi;

public class Ex01_1 {
	public static void main(String[] args){
		// 로또 번호 생성기(ver 0.0.1)
		// 1 ~ 45 까지의 번호를 무작위로 중복x
		// 6개 출력
//		int ran=0;
//		int[] data={0,0,0,0,0,0};
//		boolean boo=true;
//		int i=0;
//		while(boo && i<6){
//			ran= (int)(Math.random()*45)+1;
//			data[i]=ran;
//			if(data[i] == ran){
//				ran= (int)(Math.random()*45)+1;
//			}else{
//				boo=false;
//			}
//			i++;
//		}
		
		
		
		
		// 검사 안에 6개
		
		
		final int LOTTO=6;
		int result[] = new int[LOTTO];
		int ran=0;
		int cnt=0;
		
		for(int i=0; i<LOTTO; i++){
			int j=0;
			ran=(int)(Math.random()*45)+1;
			while(j<cnt){				// result 배열에 들어간 애들만 비교
				if(ran==result[j]){
					ran=(int)(Math.random()*45)+1;
					j=0;
					continue;
				}
				j++;
			}
			result[i]=ran;		// while문 빠져나오면 넣음
			cnt++;				// 넣을 때마다 더함
		}
		for(int i=0; i<LOTTO; i++){
			System.out.print(result[i]+" ");
		}
		
		
		
		
		
		
		
		
	}
}