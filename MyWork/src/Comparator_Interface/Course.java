package Comparator_Interface;

import java.util.Comparator;

public class Course implements Comparator<Student> {

	public int compare(Student o1, Student o2) {

		return o1.course.compareTo(o2.course);
	}

}
