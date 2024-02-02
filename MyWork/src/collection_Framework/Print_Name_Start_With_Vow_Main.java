package collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class Print_Name_Start_With_Vow_Main {
	public static void main(String[] args) {
		ArrayList<Name_Start_With_Vow> al = new ArrayList<Name_Start_With_Vow>();
		al.add(new Name_Start_With_Vow(1, "London", 75.55));
		al.add(new Name_Start_With_Vow(5, "Europe", 75.55));
		al.add(new Name_Start_With_Vow(3, "rajesh", 75.55));
		al.add(new Name_Start_With_Vow(4, "India", 75.55));
		al.add(new Name_Start_With_Vow(2, "Russia", 75.55));
		ArrayList<Name_Start_With_Vow> al1 = new ArrayList<Name_Start_With_Vow>();
		Collections.sort(al);
		String vow = "aeiouAEIOU";
		for (Name_Start_With_Vow obj : al) {
			String name = obj.name.charAt(0) + "";
			if (vow.contains(name)) {
				al1.add(obj);
			}
		}

		System.out.println(al1);
	}
}
