package BasicsOfCollectionFrameworks;

import java.util.LinkedList;

public class LinkedListIntro {
        public static void  main(String[] args) {
			
        	LinkedList<String> basics = new LinkedList<>();
        	
        	basics.add("is");
        	basics.add("a");
        	
        	
        	// now adding in last        	
        	basics.addLast("list");
        	// now adding in first      
        	basics.addFirst("this");
        	
        	// now adding in between
           basics.add(3, "linked");
           System.out.println(basics);
           
           // get element using get element
           System.out.println(basics.get(0)); 
           System.out.println(basics.get(1)); 
           System.out.println(basics.get(2)); 
           
           
           
           // size
           System.out.println(basics.size());
           
           // delete using remove function
           basics.remove(0);
           basics.removeFirst();
           basics.removeLast();
           
           
           
           System.out.println(basics);
           
        	
        	
        	
        	
		}
}
