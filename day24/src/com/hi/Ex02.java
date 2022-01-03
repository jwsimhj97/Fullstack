package com.hi;

public class Ex02 implements Runnable{

	public static void main(String[] args) {
		Ex02 work=new Ex02();
		Thread thr=new Thread(work);
		thr.start();		// thread를 run메소드로 직접호출하면 - x / start()이용 - o
	}

	@Override
	public void run() {
		Thread me=Thread.currentThread();	// thread 상속받지 않은 상태에서 getname을 얻을수없기때문에 이와같이 선언.
		String name=me.getName();
		System.out.println("새로운 스레드로 하고자 하는 일");
	}

}
