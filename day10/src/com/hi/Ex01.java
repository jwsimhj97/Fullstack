package com.hi;
// this
// �������� �ڱ��ڽ��� ����
// �ڱ��ڽ��� ��Ī�� ��� ��������(�����ϰ������� �ڵ�����)
// ���� non-static������ ��밡��

public class Ex01 {
	public static int su1=1111;
	public int su2=2222;
	
	public Ex01(){
		
	}
	
	public static void func01(){
		com.hi.Ex01 me=new com.hi.Ex01();
		me.func03();
	}
	
	public void func02(com.hi.Ex01 me){
		me.func03();
		this.func03();	//�������� me(=this)�� �����Ǿ��ִ�.
		System.out.println(me==this);
		Ex01 you=new Ex01();
		you.func03();
	}
	
	public void func03(){
		// ���������� ���������� ���ϸ����� ��������� �켱���� => ����
		int su1=4444;
		int su2=3333;
		System.out.println(su2);		// 3333
		System.out.println(this.su2);	// 2222
		System.out.println(su1);		// 4444
		System.out.println(Ex01.su1);	// 1111
	}

	public static void main(String[] args) {
		com.hi.Ex01.func01();
		com.hi.Ex01 me=new Ex01();
		me.func02(me);
		
	}

}
