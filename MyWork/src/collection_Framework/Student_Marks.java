package collection_Framework;

import java.util.Comparator;

public class Student_Marks implements Comparator<StudentArray_List> {
	@Override
	public int compare(StudentArray_List obj1, StudentArray_List obj2) {
		return (int) (obj1.marks - obj2.marks);
	}
}
