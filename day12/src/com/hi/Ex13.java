package com.hi;

public class Ex13 {

	public static void main(String[] args) {
		String[] msg={"0", "1", "둘", "3"};
		
		//크게 싸는법
		try{
			for(int i=0; i<msg.length; i++){
					int su=Integer.parseInt(msg[i]);
					System.out.println(su+1);
			}
		}catch(java.lang.NumberFormatException e){
			System.out.println("에러발생");
		}
		
		// 작게 싸는법
//		for(int i=0; i<msg.length; i++){
//			try{
//				int su=Integer.parseInt(msg[i]);
//				System.out.println(su+1);
//			}catch(java.lang.NumberFormatException e){
//				System.out.println("에러발생");
//			}
//		}
	}

}
