package com.gitdemo1;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Git {

	public static void main(String[] args) {
		 Map<Integer, String> m = new HashMap<>();
		 
		 m.put(10, "java");
		 m.put(20, "sql");
		 m.put(30, "python");
		 m.put(40, "sql");
		 m.put(10, "java Script");
		 System.out.println(m);
		 
		 //size
		 int a = m.size();
		 System.out.println(a);
		 
		 //to get the particular value from the map using key
		 
		 String b = m.get(10);
		 System.out.println(b);
		 
		 //to check particular value present or not
		 
		 boolean c = m.containsKey(10);
		 System.out.println(c);
		 
		 //check the particular value present or not
		 
		 boolean d = m.containsValue("sql");
		 System.out.println(d);
		 
		 //to get the keys only from map
		 
		 Set<Integer> e = m.keySet();
		 System.out.println(e);
		 
		 //to get the value from the map
		 
		 Collection<String> f = m.values();
		 System.out.println(f);
		 
		
		 m.clear();
		 System.out.println(m);	

		
	}

}

