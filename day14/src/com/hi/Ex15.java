package com.hi;

class Class {

	public static Class forName(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	public Remote newInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	
}




interface Remote{
	void on();
	void off();
	void work();
}
class Tv implements Remote{
	public void on(){
		System.out.println("tv�� �Ѵ�");
	}
	public void off(){
		System.out.println("tv�� ����");
	}
	public void work(){
		System.out.println("���ȭ���� �����ִ�");
	}
}

class Radio implements Remote{
	public void on(){
		System.out.println("������ �Ѵ�");
	}
	public void off(){
		System.out.println("�������� ����");
	}
	public void work(){
		System.out.println("����� ����ִ�");
	}
}

class Audio implements Remote{
	public void on(){
		System.out.println("������ �Ѵ�");
	}
	public void off(){
		System.out.println("�������� ����");
	}
	public void work(){
		System.out.println("����� ����ִ�");
	}
}


public class Ex15 {

	public static void main(String[] args) throws Exception {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		Remote remote=null;
		while(true){
			System.out.print("����(exit) >");
			input=sc.nextLine();
			if(input.equals("exit")){
				break;
			}
			Audio abc=new Audio();
			Class clz=Class.forName(input);
			remote=(Remote)(clz.newInstance());
			remote.on();
			remote.work();
			remote.off();
		}
	}

}
