package com.hi;

class Lec08{	// class�տ� final������ �Ʒ��� �ڽ� class�� ����� �źεȴ�
	public final void func2(){}	// �޼����� final�� �������̵� �ź�
}

public class Ex08 extends Lec08 {
//	public final static int su1=0;
	public final int su2;	// �ʱ�ȭ�� ���� �����ʾҴٸ� �Ŀ� �����ڿ� �ʵ尪�� �ʱ�ȭ�� �������־���Ѵ�.
	
	public Ex08(int su){
		su2=su;
	}

	public static void func(final int a){
		System.out.println(a);
	}
	
//	public void func2(){}
	
	public static void main(String[] args) {
		Lec08 you=new Lec08();
		you.func2();
		Ex08 me=new Ex08(1111);
		me.func2();
		
		// final
		final int a;	// ����� ����
		a=1111;
//		a=2222;
//		Ex08 me1=new Ex08(1111);
//		System.out.println(me1.su2);
//		Ex08 me2=new Ex08(2222);
//		System.out.println(me2.su2);
		func(1111);
		func(2222);
	}

}
