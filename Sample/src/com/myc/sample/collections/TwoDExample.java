package com.myc.sample.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TwoDExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map = new HashMap<>();
		map.put(1,"abc");
		map.put(1.5,"xyz");
		map.put("xyz","pqr");
		
		
		Map map2 = new HashMap();
		map2.put(10, "xyz");
		map2.put(20, "adfkj");
		map.putAll(map2);
		System.out.println(map);

		
		Set set = map.keySet();//all keys are stored in Set
		
		System.out.println("By using keySet...");
		Iterator ite = set.iterator();
		while(ite.hasNext()){
			Object key = ite.next();
			Object value = map.get(key);
			System.out.println(key+" -->   "+value);
		}
		
		System.out.println("By using entrySet..");
		Set eset = map.entrySet();
		Iterator eit = eset.iterator();
		while(eit.hasNext()){
			Map.Entry me = (Entry) eit.next();
			System.out.println(me.getKey()+"   "+me.getValue());
		}
		
		System.out.println("size of map is "+map.size());
		
		System.out.println(map);
		map.remove(10);
		map.clear();
		System.out.println(map);
	}

}
