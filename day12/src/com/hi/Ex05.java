package com.hi;
class Machine{
	public void on(){
		System.out.println("�Ѵ�");
	}
	public void off(){
		System.out.println("����");
	}
	public void work(){
	}
}
class Tv extends Machine{
	public void on(){
		System.out.println("�Ѵ�");
	}
	public void off(){
		System.out.println("����");
	}
	public void work(){
		System.out.println("������ �����ش�");
	}
}
class Radio extends Machine{
	public void on(){
		System.out.println("�Ѵ�");
	}
	public void off(){
		System.out.println("����");
	}
	public void work(){
		System.out.println("���ļ��� ��Ƽ� �Ҹ��� ����ش�");
	}
}

class Audio extends Machine{
	public void work(){
		System.out.println("������ ����ش�");
	}
}

public class Ex05 {

	public static void main(String[] args) {
//		Tv tv=new Tv();
//		tv.on();
//		tv.work();
//		tv.off();
		
//		Radio ra=new Radio();
//		ra.on();
//		ra.work();
//		ra.off();
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("1.TV������ 2.Radio������ 3.Audio������ >");
		String input=sc.nextLine();
		
		Machine remote=null;		// ������Ʈ Ŭ������ ���� Ŭ������ ��ӹ޴´�
		
		if(input.equals("1")){
			remote=new Tv();
		}else if(input.equals("2")){
			remote=new Radio();
		}else if(input.equals("3")){
			remote=new Audio();
		}
		
		remote.on();
		remote.work();
		remote.off();
	}

}
