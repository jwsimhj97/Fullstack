package com.hi;

import java.util.Iterator;

public class Ex09 {

	public static void main(String[] args) {
		// Map Ÿ�� <key, Value> - key���� ������ �� value���� ���´�(������ Ű���� ������ ������� �����Ѵ�) / key���� �ٸ��� value���� �������ִ�
		java.util.Map map=new java.util.HashMap();
		map.put("key1", 1111);
		map.put("key1", null);
		map.put(1000, "val3");
		map.put('@', 3.14);
		map.put(null, true);
		map.put(3.14, "val3");
		map.put('@', 4.14);
		
		System.out.println(map.get("key1"));		
		System.out.println(map.get("key2"));		
		System.out.println(map.get(1000));		
		System.out.println(map.get('@'));		
		System.out.println(map.get(null));		
		System.out.println(map.get(3.14));
		
		System.out.println("---------------------------");
		
		java.util.Set keys=map.keySet();
		Iterator ite=keys.iterator();
		while(ite.hasNext()){
			Object key=ite.next();
			Object val=map.get(key);
			System.out.println(key+":"+val);
		}
	}

}
