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
		System.out.println("tv를 켜다");
	}
	public void off(){
		System.out.println("tv를 끄다");
	}
	public void work(){
		System.out.println("방송화면을 보여주다");
	}
}

class Radio implements Remote{
	public void on(){
		System.out.println("라디오를 켜다");
	}
	public void off(){
		System.out.println("라디오를를 끄다");
	}
	public void work(){
		System.out.println("방송을 들려주다");
	}
}

class Audio implements Remote{
	public void on(){
		System.out.println("라디오를 켜다");
	}
	public void off(){
		System.out.println("라디오를를 끄다");
	}
	public void work(){
		System.out.println("방송을 들려주다");
	}
}


public class Ex15 {

	public static void main(String[] args) throws Exception {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		Remote remote=null;
		while(true){
			System.out.print("종료(exit) >");
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
