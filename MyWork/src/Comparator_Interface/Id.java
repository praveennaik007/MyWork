package Comparator_Interface;

import java.util.Comparator;

public class Id implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		if (o1.id > o2.id)
			return 1;
		if (o1.id < o2.id)
			return -1;
		return 0;
	}

}
