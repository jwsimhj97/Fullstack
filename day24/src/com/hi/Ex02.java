package com.hi;

public class Ex02 implements Runnable{

	public static void main(String[] args) {
		Ex02 work=new Ex02();
		Thread thr=new Thread(work);
		thr.start();		// thread�� run�޼ҵ�� ����ȣ���ϸ� - x / start()�̿� - o
	}

	@Override
	public void run() {
		Thread me=Thread.currentThread();	// thread ��ӹ��� ���� ���¿��� getname�� ���������⶧���� �̿Ͱ��� ����.
		String name=me.getName();
		System.out.println("���ο� ������� �ϰ��� �ϴ� ��");
	}

}
