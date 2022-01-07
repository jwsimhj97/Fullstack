package com.hi;

import java.io.*;	// *
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

public class Ex01 {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("test01.bin");
			oos=new ObjectOutputStream(fos);
			
			char[] arr1={'a','b','c'};
			Vector vec=new Vector();
			vec.add(1111);
			vec.add(3.14);
			vec.add("���ڿ�");
			ArrayList list=new ArrayList();
			list.add(2222);
			list.add(4.14);
			HashSet set=new HashSet();
			set.add(3333);
			set.add(5.14);
			set.add(3333);
			HashMap map=new HashMap();
			map.put("key1", "val1");
			map.put("key2", "val2");
			ArrayList list2=new ArrayList();
			list2.add(list);
			list2.add(set);
			

			
			oos.write(65);
			oos.writeInt(65);
			oos.writeDouble(3.14);
			oos.writeObject(vec);
			oos.writeObject(arr1);
			oos.writeObject(list);
			oos.writeObject(set);
			oos.writeObject(map);
			oos.writeObject(list2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
