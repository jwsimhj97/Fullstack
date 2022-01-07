package com.hi;
// 데몬스레드 - 종속된 스레드 (ex: dialog box)
public class Ex15 extends Thread{
	@Override
	public void run() {
		System.out.println("데몬 스레드 시작");
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("데몬 스레드 종료");
	}

	public static void main(String[] args) {
		System.out.println("main start...");
		Ex15 me=new Ex15();
		me.setDaemon(true);		// 임시저장?
		me.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main end...");
	}

}
