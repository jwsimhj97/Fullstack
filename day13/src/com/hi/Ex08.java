package com.hi;
class MyException extends Exception{
	public MyException(){
		super("1�� ������ ����");
	}
}

public class Ex08 {
	static void func(int a, int b) throws MyException{
		if(b==1){
			MyException ex=new MyException();
			throw ex;
		}
		int c=a/b;
		
		System.out.println(a+"/"+b+"="+c);
	}

	public static void main(String[] args) {
		try{
			func(6,1);
		}catch(MyException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
