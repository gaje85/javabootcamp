package com.toyota.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExamples {
	
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>(3);
		arrList.add("one");
		arrList.add("two");
		arrList.add("one");
		arrList.add("three");
		System.out.println(arrList);
		
		LinkedList<String> ll = new LinkedList<String>();
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("one");
		hs.add("three");
		System.out.println(hs);
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(100);
		ts.add(20);
		ts.add(200);
		ts.add(10);
		System.out.println(ts);
		
		
		TreeSet<String> tss = new TreeSet<>();
		tss.add("one");
		tss.add("two");
		tss.add("three");
		tss.add("four");
		System.out.println(tss);
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"this is one");
		hm.put(2,"this is two");
		hm.put(1,"this is one");
		hm.put(3,"this is three");
		
		System.out.println(hm);
		System.out.println(hm.get(3));
		
		
		Iterator<String> iter = arrList.iterator();
		
		while(iter.hasNext()) {
			String ss = iter.next();
			System.out.println(ss);
		}
		
		for (String string : arrList) {
			System.out.println(string);
		}
		
		Set<Integer> key = hm.keySet();
		Collection<String> collValue = hm.values();
		
		Iterator keyIter = key.iterator();
		Iterator valueIter = collValue.iterator();
		while(keyIter.hasNext()) {
			System.out.println(keyIter.next() + " , "+valueIter.next());
		}
		
		
		
		
	}

}
