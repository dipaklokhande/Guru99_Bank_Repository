package com.guru99_bank.pom;

import java.util.ArrayList;
import java.util.Iterator;

public class NewFunctionalityAdded {
	 public static void main(String[] args) {
			
		 ArrayList ar = new ArrayList();
		 
		 ar.add(2);
		 ar.add("java");
		 ar.add('A');
		 ar.add(2);
		 ar.add(null);
		 
		 System.out.println(ar.size());
		 System.out.println(ar.isEmpty());
		 System.out.println("................Different Operations...............");
		 
		 System.out.println(ar.indexOf(2));
		 System.out.println(ar.lastIndexOf(2));
		 System.out.println(ar.contains("xyz"));
		 System.out.println(ar.get(2));
		 System.out.println(ar);
				
		 ar.add(3,"abc");
		 System.out.println(ar);
		 ar.add(5,777);
		 System.out.println(ar);
		 
		 ar.remove(5);
		 System.out.println(ar);
		 
		 System.out.println("............. Read using Iterator...........");
		 
		  Iterator aa = ar.iterator();
		  
		  while(aa.hasNext()) {
			  System.out.println(aa.next());
			  
		  }
				 
		
		
		 
		 
	}

}
