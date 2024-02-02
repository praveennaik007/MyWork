package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Map_Methods {
public static void main(String[] args) {
	Map<Integer, Integer> m=new HashMap<Integer, Integer>();
	m.put(1, 11);
	m.put(2, 22);
	m.put(3, 33);
	m.put(4, 44);
	m.put(5, 55);
	System.out.println(m);
	
	System.out.println(m.values());
//	Collection<Integer> java.util.Map.values();
	System.out.println(m.toString());
//	String java.lang.Object.toString();
	m.remove(5);
//	Integer java.util.Map.remove(Object key);
	System.out.println(m);
	System.out.println(m.remove(4));
//	Integer java.util.Map.remove(Object key);
	m.remove(3, 33);
//	boolean java.util.Map.remove(Object key, Object value;
	System.out.println(m);
	System.out.println(m.keySet());
//	Set<Integer> java.util.Map.keySet();
	System.out.println(m.get(1));
//	Integer java.util.Map.get(Object key);
	System.out.println(	m.containsKey(2));
//	boolean java.util.Map.containsKey(Object key);
	System.out.println(m.containsValue(11));
//	boolean java.util.Map.containsValue(Object value);
	System.out.println(m.hashCode());
	
}
}
