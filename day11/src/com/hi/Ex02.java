package com.hi;

public class Ex02 {

	public static void main(String[] args) {
		String msg="abcdefg";		
		String msg2="abcabcd";
		//equals
		//getBytes
		//toCharArray
		
		//charAt		
		char ch1=msg.charAt(1);						// ����� b; charAt(x) - �ε���x��°�� ��
		System.out.println(ch1);
		
		//concat
		String result1=msg.concat("\\|"+msg);			// int su=1+2;�� �İ��� �ٸ� �����̴�. int->1+2=3 / String->1+2=12
		String result2=msg+"ABCD";
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(msg);
		
		//indexOf
		System.out.println(msg.indexOf('c'));
		System.out.println(msg2.indexOf('c',0));	// indexOf('char', ������?)
		System.out.println(msg2.indexOf("cd"));		// ����� 5; ""�� �����ε�����ȣ
		
		//length
		System.out.println(msg2.length());			// ����
		for(int i=0; i<msg2.length(); i++){
			System.out.print(msg2.charAt(i));
		}
		
		System.out.println();
		
		//replace
		String result3=msg2.replace('d','D');		// ���ǰ��� ���� ������ ����
		String result4=msg2.replace('b','B');
		String result5=msg2.replace("b","B");
		String result6=msg2.replace("cab", "cb");	// ���ڿ��� �߰��ϰų� ���ؼ� �������ִ� ex) String msg="abcd"; => msg.replace("ab","acdb"); => acdbcd
		System.out.println(result3);
		System.out.println(result6);
		
		//substring
		String result7=msg2.substring(2);			// ()�ε������� ���� ���� ������
		String result8=msg2.substring(2,5);			// ���� �ε��� ������ ���� �ε������� ���۵Ǳ����� ������ ������ ���������� ������
		System.out.println(result7);
		System.out.println(result8);
		
		//toString
		System.out.println(msg.toString());			// ���� ����
		
		//valueOf 
		String result9=String.valueOf(3.14);
		String result10=String.valueOf(true);		// ������ ���ڿ�(String)���� �ٲ��ش�
		System.out.println(result9);
		System.out.println(result10);
	}

}
