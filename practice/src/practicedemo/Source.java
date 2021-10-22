package practicedemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
	    
		ArrayList<String> list =new ArrayList<String>();
		list.add("a");
		list.add("v");
		list.add("c");
		list.add("f");
		
		
		ArrayList<String> n=  new ArrayList<String>();
	    n= changeListOccurences(list, "a", "v");
	    for(String n1:n) {
	    	System.out.println(n1);
	    }

	}
	
	public static ArrayList<String> createList(int num, String str) {
		
		ArrayList<String> arr=new ArrayList<String>();
		
		for(int i=0; i< num; i++) {
			
			arr.add(str);
			
		}
		
		return arr;
		
		
	}
	
	public static ArrayList<String> changeListOccurences(ArrayList<String> list, String m, String n) {
		

	int i=	list.indexOf(m);
  
  
	  list.set(i, n);
  
    
		
		
		return list;
		
		
		
	}

}
