package com.hi;

import java.io.*;

public class Ex03 implements Serializable{	
	public static final long serialVersionUID = 3L;
	int su1=1111;
	transient int su2=2222;	// transient - ����ȭ��󿡼� ����
	int su3=3333;
	
	public void func(){
		System.out.println("�޼���� ����ȭ����� �ƴմϴ�");
	}

	public static void main(String[] args) {
		OutputStream os=null;
		ObjectOutputStream oos=null;
		
		try {
			os=new FileOutputStream("test02.bin");
			oos=new ObjectOutputStream(os);
			oos.writeObject("���ڿ�");
			
			Ex03 me=new Ex03();
			oos.writeObject(me);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				oos.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
