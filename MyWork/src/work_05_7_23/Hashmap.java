package work_05_7_23;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {
public static void main(String[] args) {
	Map<Integer, Integer> hm=new HashMap<Integer, Integer>();
	hm.put(1, 10);
	hm.put(2, 20);
	hm.put(3, 30);
	hm.put(4, 40);
	
	for (Entry<Integer, Integer> obj : hm.entrySet()) {
		System.out.println(obj.getValue());
	}
	}
	
}
