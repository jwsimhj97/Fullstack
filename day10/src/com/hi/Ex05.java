package com.hi;

public class Ex05 {
	public String msg;
	
	public Ex05(){
		this("hello");	//this�� ���ο� �����ڿ��� �ٸ� �����ڸ� �ҷ��´�?& ��������ʴ� �����ڰ� �ʿ��ϴ�& this�� �������� �� ù�ٿ� �;��Ѵ�
		return;
	}
	public Ex05(String msg){	//��ü����
		this.msg=msg;
		for(int i=0; i<1; i++){
			System.out.println(msg);
		}
		return;
	}
	
	public Ex05(String msg,int cnt){	//��ü����
		this.msg=msg;
		for(int i=0; i<cnt; i++){
			System.out.println(msg);
		}
		return;
	}
	
	
	public static void main(String[] args) {
//		Ex05 me=new Ex05();
//		Ex05 me=new Ex05("java");
		Ex05 me=new Ex05("eazy",5);
	}

}
