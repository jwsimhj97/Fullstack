package com.hi;

public class Ex08 {

	public static void main(String[] args) {
		// �ֹι�ȣȮ��
		char[] temp1={'��', '��', '��', '��', '��', '��', '��', 'ĥ', '��', '��'};
		char[] temp2={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		System.out.print("�ֹι�ȣ >");
		input="�������̻���-�����̻�����";//sc.nextLine();
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
			System.out.println("-�� �ݵ�� �Է��ϼ���");
			return;
		}
		if(arr[6]!='-'){
				System.out.println("�Է¿���");
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
		System.arraycopy(arr,0,arr2,2,2);		// arr�� 0��°, arr2�� 2��°�� 2���̸�ŭ ����
		String year=new String(arr2);			// char[] -> String
		int su=Integer.parseInt(year);
		System.out.print("����� "+(2021-su+1)+"�� ");
		
		if(arr[7]%2==0){
			System.out.print("��");
		}else{
			System.out.print("��");
		}
		System.out.print("���Դϴ�");
		
		
	}

}
