package Collection_Listproj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_Add_Elements {
public static void main(String[] args) {
	List al=new ArrayList();
	for (int i = 0; i <=10; i++) {
		al.add(i);
	}
	System.out.println(al);
	
	Iterator itr=al.iterator();
	while(itr.hasNext()) {
		 Integer in=(Integer) itr.next();
	if(in%2==0) {
		System.out.println(in);
	}
	else {
		itr.remove();
	}
	}
}
}
