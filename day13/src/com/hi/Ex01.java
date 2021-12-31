package com.hi;

public class Ex01 {

	public static void main(String[] args) {
		// 로또 번호 생성기(ver 0.0.1)
		// 1 ~ 45 까지의 번호를 무작위로 중복x
		// 6개 출력
//		double ran=Math.random()*45;	
		int[] data=new int[6];
		data[0]=22;
		
		for(int i=0; i<6; i++){
			int ran=(int)(Math.random()*45)+1;
			data[i]=ran;
			System.out.println(ran);
			
			// 만약 ran 출력값이 data에 들어가있는 수이면 다시 출력한다
		}
	}

}
