package com.hi;

public class Ex05 extends Thread{

	public static void main(String[] args) {
		Ex05 thr1=new Ex05();
		Ex05 thr2=new Ex05();
		Ex05 thr3=new Ex05();
		thr1.setPriority(Thread.MIN_PRIORITY);	// MIN_PRIORITY = 1 // thread �켱���� 1~10, default=5�̴�
		thr2.setPriority(Thread.NORM_PRIORITY); // NORM_PRIORITY = 5
		thr3.setPriority(Thread.MAX_PRIORITY);	// MAX_PRIORITY = 10
		thr1.start();
		thr2.start();
		thr3.start();
	}

	@Override
	public void run() {
		int su=this.getPriority();	// (�켱����) thread�� ������ ������ ����
		for(int i=0; i<10; i++){
			System.out.println(su+getName()+" run..."+i);
		}
	}
}
