package Map_Interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Demo {
public static void main(String[] args) {
	HashMap map=new HashMap();
	map.put(1, "hi");
	map.put(2, "hi");
	map.put(3, "hi");
	map.put(4, "hi");
	System.out.println(map.keySet());
	Set keys=map.keySet();
	for (Object object : keys) {
		System.out.println(object);
	}
	System.out.println("*************");
	Collection values=map.values();
	for (Object object : values) {	
	System.out.println(object);	
	}
}
}
