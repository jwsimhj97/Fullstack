package com.hi;

public class Ex04 {
	// �����ڿ����� this
	// �����ڿ����� �ڱ��ڽ��� �����ϱ����ؼ� this�� ����Ҽ��ۿ� ����
	public int su=1111;
	
	public Ex04(){
		System.out.println("1. su="+su);
	}
	
	public Ex04(int su){
		this.su=su;
		System.out.println("2. su="+this.su);
	}
	
	public Ex04(Ex04 me){
		System.out.println("3. su="+this.su);
	}

	public static void main(String[] args) {
//		Ex04 me=new Ex04();
		Ex04 me2=new Ex04(2222);
		Ex04 me3=new Ex04(me2);
	}

}
