package com.hi;

public class Ex01t {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("�л������������α׷� (ver 0.3.0)");
		System.out.print("�ѿ� >");
		String input=sc.nextLine();
		int tot=changeSu(input);
		int[] kor=new int[tot];
		int[] eng=new int[tot];
		int[] math=new int[tot];
		boolean boo=true;
		int cnt=0;
		while(boo){
			System.out.print("1.�Է� 2.���� 0.���� >");
			input=sc.nextLine();	//���� ���� input�� ��Ȱ�� -> ȿ����
			int su=changeSu(input);
			if(su==0){
				boo=false;
			}else if(su==1&&cnt!=tot){
				//�Է�
				kor[cnt]=inputSu("���� >");
				eng[cnt]=inputSu("���� >");
				math[cnt]=inputSu("���� >");
				cnt++;				
			}else if(su==1){
				System.out.println("���̻� �Է��Ͻ� �л��� �����ϴ�");
			}else if(su==2){
				//���
				System.out.println("-------------------------------");
				System.out.println("����\t| ����\t| ����");
				System.out.println("-------------------------------");
				for(int i=0; i<tot; i++){
					System.out.println(kor[i]+"\t| "+eng[i]+"\t| "+math[i]);
				}
				System.out.println("-------------------------------");
			}else{
				System.out.println("�Է��� �߸��Ǿ����ϴ�");
			}
		}

	}
	
	//���ȭ
	//������ �Է¹ް� ���ڷ� �������ִ� ���
	public static int inputSu(String title){
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print(title);
		String msg=sc.nextLine();
		int su=changeSu(msg);
		boolean boo=true;
		//������ ������ 0 ~ 100 ������ ���� ����
		while(boo){
			if(su<0 || su>100){
				System.out.print("������ 0 ~ 100 ������ ���� ����\n ���Է� >");
				msg=sc.nextLine();
				su=changeSu(msg);
			}
			if(su>=0&&su<=100){
				boo=false;
			}
		}
		return su;
	}

	//���ڿ��� ���ڷ� �ٲ��ִ� ���
	public static int changeSu(String msg){
		int su=Integer.parseInt(msg);
		return su;
	}

}
