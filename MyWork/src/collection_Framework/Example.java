package collection_Framework;

//import java.util.PriorityQueue;
import java .util.HashMap;
import java.util.Hashtable;
import java.util.Set;


public class Example {
public static void main(String[] args) {
//	PriorityQueue c=new PriorityQueue();
//	c.offer('a');
//	c.offer('b');
//	c.offer('g');
//	c.offer('u');
//	c.offer(1);
//	System.out.println(c);
//	System.out.println(c.peek());
//	System.out.println(c);
//	System.out.println(c.poll());
//	System.out.println(c);
	HashMap <Integer,String> hm= new HashMap<Integer,String>();
    hm.put (5,"srihari");
    hm.put (6,"rohit");
    hm.put (2,"chandu");
    hm.put (4,"chaithu");
    System.out.println(hm);
    Hashtable <Integer,String> ht= new Hashtable<Integer,String>();
    ht.put (1,"pavan");
    ht.put (7,"sai");
    ht.put (9,"ravi");
    ht.put (8,"kiran");
    hm.putAll(ht);
    System.out.println(ht);
    hm.remove(6);
    System.out.println(hm);
    hm.remove(2,"chaithu");
    System.out.println(hm);
    System.out.println(hm.containsKey(3));
    System.out.println(hm.containsValue("chandu"));
    System.out.println(hm.isEmpty());
//    hm.clear ();
    System.out.println(hm);
    System.out.println(hm.isEmpty());
    System.out.println(hm.size());
    hm.replace(6, "tarun");
    System.out.println(hm);
    System.out.println(hm.get(4));
    Set<Integer> Keys = hm.keySet();
    System.out.println(Keys);
    
    
    
    
    
    
    
    

    
	
	
	
	
	
	
	
	
	
	
}
}
