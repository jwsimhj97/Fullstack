package com.hi;

public class Ex13 {

	public static void main(String[] args) {
		String[] msg={"0", "1", "��", "3"};
		
		//ũ�� �δ¹�
		try{
			for(int i=0; i<msg.length; i++){
					int su=Integer.parseInt(msg[i]);
					System.out.println(su+1);
			}
		}catch(java.lang.NumberFormatException e){
			System.out.println("�����߻�");
		}
		
		// �۰� �δ¹�
//		for(int i=0; i<msg.length; i++){
//			try{
//				int su=Integer.parseInt(msg[i]);
//				System.out.println(su+1);
//			}catch(java.lang.NumberFormatException e){
//				System.out.println("�����߻�");
//			}
//		}
	}

}
