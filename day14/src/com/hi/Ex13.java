package com.hi;

public class Ex13 {

	int su=1234;
	
	public static void main(String[] args) {
		// 자바 리플랙션
		Ex13 me=new Ex13();
		System.out.println(me.su);
		
		String info="com.hi.Ex13";
		try {
			Class cls=Class.forName(info);
			System.out.println(cls.getDeclaredField("su").getName());
			System.out.println(cls.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

}
