package Collection_Listproj;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Forward_BackWord {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("Apple");
	al.add("Bananna");
	al.add("Custured Apple");
	al.add("Mango");
	al.add("Grapes");
	System.out.println("=>***Forward Direction***<=");
	ListIterator<String> li=al.listIterator();
	while (li.hasNext()) {
		System.out.println(li.next());
	}
	System.out.println("=>***BackWord Direction***<=");
	ListIterator<String> back=al.listIterator(al.size());
	while (back.hasPrevious()) {
		System.out.println(back.previous());
	}
}
}
