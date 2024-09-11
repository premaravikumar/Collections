package Collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Linkedlist {
	
      public static void main(String args[]) {
    	  
     Comparator<Integer> com=new Comparator<Integer>() {
		
		public int compare(Integer o1, Integer o2) {
			if(o1 >o2)
				return 1;
			else
			  return -1;
		}
	}; 	  
    	  
    	  LinkedList<Integer> list=new LinkedList<Integer>();
    	  list.add(46);
    	  list.add(0);
    	  list.add(32);
    	  list.add(1000);
    	  list.add(56);
    	  list.add(78);
    	  list.add(910);
    	  
    	  Collections.sort(list,com);
    	  
    	  System.out.println(list);
    	  
    	 
     }

}
