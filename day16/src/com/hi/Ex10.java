package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		// Set = ������ ���� | Set�� �ߺ����� ������� �ʴ´�
//		java.util.Set set=new java.util.HashSet();	// HashSet - �ߺ��˻縦 �Ѵ�
		java.util.Set set=new java.util.TreeSet();	// TreeSet - �ڵ����� �ߺ��˻�, sort(����������)������ �Ѵ�
//		set.add("ù��°");
//		set.add("�ι�°");
//		set.add("����°");
//		set.add("�׹�°");
		
		set.add(4444);
		set.add(2222);
		set.add(1111);
		set.add(3333);
		
		System.out.println("size:"+set.size());	// ����
		
		java.util.Iterator ite=set.iterator();	// iterator - �ݺ���. �迭�̳� �׿� ������ �ڷ� ������ ������ ��Ҹ� ��ȸ(traversing)�ϴ� ��ü
		while(ite.hasNext()){					// hasNext - �ڿ� �˷��� ������ ������ true ������ false
			System.out.println(ite.next());
		}
		
//		java.util.Iterator ite2=set.iterator();
//		while(ite2.hasNext()){
//			System.out.println(ite2.next());
//		}
	}

}
