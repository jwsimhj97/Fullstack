package com.room802;

public class Ex11 {

	public static void main(String[] args) {
		// ���ǹ� - switch��
		// switch(����){
		//  case ��:���๮;break;
		//  case ��:���๮;break;
		//  case ��:���๮;break;
		//  ...
		//  default:���๮;
		// }
		// ���� - value ��
		// �� case ��(����x, ����x, ...)
		// default (if���� else����)
		// ���ǰ� case�� ��� ���� �ڷ����� ��ġ�ؾ���
		
		int su=1;
		switch(su){
			case 2:
				System.out.println("2�Դϴ�");
				break;
			case 1:
				System.out.println("1�Դϴ�");
				break;
			case 0:
				System.out.println("0�Դϴ�");
				break;
			default :
				System.out.println("2~0������ ���� �ƴմϴ�");
		}
	}

}
