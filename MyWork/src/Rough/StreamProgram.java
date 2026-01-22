package Rough;

import java.util.ArrayList;
import java.util.List;

public class StreamProgram {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		for (int i = 1; i <=10; i++) {
			list.add(i);
			list.add(i);
		}
		System.out.println(list);
		
		
//		list.stream().filter(x->!(x%2==0)).forEach(x->System.out.println(x+" "));
        list.stream().distinct().filter(x->!(x%2==0)).forEach(x->System.out.println(x+" "));
	}
}
