package com.hi;

public class Ex05 {
	public String msg;
	
	public Ex05(){
		this("hello");	//this는 새로운 생성자에서 다른 생성자를 불러온다?& 사용하지않는 생성자가 필요하다& this는 생성장의 맨 첫줄에 와야한다
		return;
	}
	public Ex05(String msg){	//객체생성
		this.msg=msg;
		for(int i=0; i<1; i++){
			System.out.println(msg);
		}
		return;
	}
	
	public Ex05(String msg,int cnt){	//객체생성
		this.msg=msg;
		for(int i=0; i<cnt; i++){
			System.out.println(msg);
		}
		return;
	}
	
	
	public static void main(String[] args) {
//		Ex05 me=new Ex05();
//		Ex05 me=new Ex05("java");
		Ex05 me=new Ex05("eazy",5);
	}

}
