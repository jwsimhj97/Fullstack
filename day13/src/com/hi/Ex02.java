package com.hi;

abstract class Machine{
	void on(){
		System.out.println("켜다");
	}
	void off(){
		System.out.println("끄다");
	}
	abstract void work();
}
class Tv extends Machine{
	void work(){
		System.out.println("방송을 보여주다");
	}
}
class Radio extends Machine{
	void work(){
		System.out.println("방송을 들려주다");
	}
}
class Audio extends Machine{
	void work(){
		System.out.println("음악을 들려주다");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		Machine remote=null;
		while(true){
			System.out.print("1.tv 2.radio 3.audio 0.종료 >");
			String input=sc.nextLine();
			if(input.equals("1")){
				remote=new Tv();
			}else if(input.equals("2")){
				remote=new Radio();
			}else if(input.equals("3")){
				remote=new Audio();
			}else if(input.equals("0")){
				break;
			}
			remote.on();
			remote.work();
			remote.off();
		}
	}

}
