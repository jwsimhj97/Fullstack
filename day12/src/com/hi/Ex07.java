package com.hi;
// 
public class Ex07 {

	public static void main(String[] args) {
 		for(int i=0; i<10; i++){
			if(i>4){
				return;
//				return;		- �ش�޼����� ����(�ݺ������� �����ϸ� ������ ������ ȣ���� ������ ���ư���, ���û�����) - �޼��� ��𼭳�
//				continue;	- �ش� �ݺ����� ������� ���ư���(�ݺ����������� ����)
//				break;		- �ش� switch��||�ݺ������� Ż��(�ݺ�����, switch�������� ����)
			}
			System.out.println(i);
		}
		System.out.println("main ����");
	}
}
