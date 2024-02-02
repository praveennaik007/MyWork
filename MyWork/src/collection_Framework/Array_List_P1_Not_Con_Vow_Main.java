package collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Array_List_P1_Not_Con_Vow_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String vowel = "aeiouAEIOU";
		ArrayList<Array_List_P1> al = new ArrayList<Array_List_P1>();
		ArrayList<Array_List_P1> al1 = new ArrayList<Array_List_P1>();
		al.add(new Array_List_P1(4, "asd", 35.65));
		al.add(new Array_List_P1(1, "bsd", 36.65));
		al.add(new Array_List_P1(3, "usd", 37.65));
		al.add(new Array_List_P1(2, "dsd", 38.65));
		al.add(new Array_List_P1(5, "csd", 39.65));

		for (Array_List_P1 p : al) {
			String ch = p.name.charAt(0) + "";
			if (!vowel.contains(ch)) {
				al1.add(p);
			}
		}

		Comparator<Array_List_P1> c = (arg0, arg1) -> {
			return arg0.id - arg1.id;
		};
		Collections.sort(al1, c);
		for (Array_List_P1 array : al1) {
			System.out.println(array);
		}
	}
}
