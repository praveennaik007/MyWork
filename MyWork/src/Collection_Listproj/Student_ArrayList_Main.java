package Collection_Listproj;

import java.util.ArrayList;
import java.util.Collections;

public class Student_ArrayList_Main {
public static void main(String[] args) {
	ArrayList<StudentArray_List> al=new ArrayList<StudentArray_List>();
	al.add(new StudentArray_List(1, "hero", 76.66, 1));
	al.add(new StudentArray_List(2, "zero", 56.66, 3));
	al.add(new StudentArray_List(3, "blero", 79.66, 4));
	al.add(new StudentArray_List(4, "hero", 46.66, 4));
	al.add(new StudentArray_List(5, "rero", 96.66, 1));	
	Student_Marks std=new Student_Marks();
	Collections.sort(al,std);
	ArrayList<StudentArray_List> l=new ArrayList<StudentArray_List>();

	for (StudentArray_List list : al) {
		if(list.id!=list.admin_Id) {
			l.add(list);	
		}
	}
	for (StudentArray_List s : l) {
		System.out.println(s);
	}

	
}
}
