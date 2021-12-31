package com.hi;
class Machine{
	public void on(){
		System.out.println("켜다");
	}
	public void off(){
		System.out.println("끄다");
	}
	public void work(){
	}
}
class Tv extends Machine{
	public void on(){
		System.out.println("켜다");
	}
	public void off(){
		System.out.println("끄다");
	}
	public void work(){
		System.out.println("영상을 보여준다");
	}
}
class Radio extends Machine{
	public void on(){
		System.out.println("켜다");
	}
	public void off(){
		System.out.println("끄다");
	}
	public void work(){
		System.out.println("주파수를 잡아서 소리를 들려준다");
	}
}

class Audio extends Machine{
	public void work(){
		System.out.println("음악을 들려준다");
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
		System.out.print("1.TV리모콘 2.Radio리모콘 3.Audio리모콘 >");
		String input=sc.nextLine();
		
		Machine remote=null;		// 오브젝트 클래스는 상위 클래스를 상속받는다
		
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
