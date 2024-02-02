package collection_Framework;

import java.util.Comparator;

public class StudentArray_List {

	int id;
	String name;
	double marks;
	int admin_Id;

	public StudentArray_List(int id, String name, double marks, int admin_Id) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.admin_Id = admin_Id;
	}

	@Override
	public String toString() {
		return "StudentArray_List [id=" + id + ", name=" + name + ", marks=" + marks + ", admin_Id=" + admin_Id + "]";
	}

}
