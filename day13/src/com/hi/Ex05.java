package com.hi;

// interface - Ŭ�����ƴ�, ���߻���� ���
// ���߻���� ȿ���� ���̰��ϰ������
interface Inter02 {
	void func01();
}
interface Inter03 extends Inter02,Inter04 {}
interface Inter04 {}

public class Ex05 extends Ex01 implements Inter03 {
	public void func02(Inter04 me){}
	
	public void func01(){}

	public static void main(String[] args) {
		Ex05 me=new Ex05();
		me.func01();
		me.func02(me);
		Inter02 you=null;
		you.func01();
	}

}
