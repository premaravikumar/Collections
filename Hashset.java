package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hashset {
	
	public static void main(String args[]){
		
	Comparator<String> com=new Comparator<String>() {
		
		@Override
		public int compare(String o1, String o2) {
           if(o1.length() > o2.length())
			return 1;
           else
        	   return -1;
		}
	}; 
		
	   List<String> set=new ArrayList<String>();
		set.add("CHETHAN");
		set.add("BHARATH");
		set.add("AJAY");
		set.add("REVANTH");
		set.add("CHETHAN PRASAD");
		set.add("Nikhitha");
		
		System.out.println("before sort using comparator");
		for(String s:set) {
			System.out.println(s);
		}
		
		Collections.sort(set, com);
		
		System.out.println("after sort using comparator based on length");
		for(String s:set) {
			System.out.println(s);
		}
	}

}
