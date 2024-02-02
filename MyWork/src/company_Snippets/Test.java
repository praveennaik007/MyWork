package company_Snippets;

import java.util.Map;
import java.util.TreeMap;

public class Test {
public static void main(String[] args) {
	Map<String, String> cities=Map.of("1","Hyd","3","Channai", "2","Bang","1","Delhi");
	TreeMap<String, String> treeMap=new  TreeMap<String, String>();
	treeMap.putAll(cities);
	System.out.println(treeMap);

}
}
