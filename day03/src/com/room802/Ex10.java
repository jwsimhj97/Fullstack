package com.room802;

public class Ex10 {

	public static void main(String[] args) {
		// 1���� if���� else if�� else���� ���� �� �ִµ�
		// else if���� 0�� �̻�
		// else���� 0�� �Ǵ� 1��
		// 1���� ������ �����ϴ� ���� ������ �ϰ� ����������
		
		// su=5;
		// su�� ����̸� "����Դϴ�"���
		// su�� �����̸� "�����Դϴ�"���
		int su=5;
		if(su>0){
			System.out.println("����Դϴ�");
		}
		if(!(su>0)){
			System.out.println("�����Դϴ�");
		}
		
		System.out.println("------------------");
		
		int su2=0;
		if(su2>0){
			System.out.println("0���� Ů�ϴ�");
		}else{
			System.out.println("0���� �۰ų� �����ϴ�");
		}
		
		System.out.println("------------------");
		
		if(su2>0){
			System.out.println("0���� Ů�ϴ�");
		}
		if(su2==0){
			System.out.println("0�Դϴ�");
		}
		if(su2<0){
			System.out.println("0���� �۽��ϴ�");
		}

		System.out.println("------------------");
		
		if(su2>0){
			System.out.println("0���� Ů�ϴ�");
		}
		//���� ������ �������� �ʰ� �׸��� su>-1�� �����ϴ�
		if(!(su2>0) && su2>-1){
			System.out.println("0�Դϴ�");
		}
		if(su2<0){
			System.out.println("0���� �۽��ϴ�");
		}
		
		System.out.println("------------------");
		
		if(su2>0){
			System.out.println("0���� Ů�ϴ�");
		}else if(su2==0){
			System.out.println("0�Դϴ�");
		}else if(su2<0){
			System.out.println("0���� �۽��ϴ�");
		}
	}

}
