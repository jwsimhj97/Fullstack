package com.room802;
// �� �� ��
// �� ��
// ��
public class Ex08 {

	public static void main(String[] args) {
		for(int i=3; i>0; i--){
			for(int j=0; j<i; j++){
				System.out.print('��');
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3-i; j++){
				System.out.print('��');
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		int su=1;
		for(int i=0; i<3; i++){
			for(int j=0; j<3-i; j++){
				System.out.print(su++);
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		int cnt=10;
		for(int i=0; i<cnt; i++){
			for(int j=0; j<cnt-i; j++){
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

}
