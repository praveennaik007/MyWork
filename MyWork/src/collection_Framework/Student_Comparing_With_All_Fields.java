package collection_Framework;

public class Student_Comparing_With_All_Fields implements Comparable<Student_Comparing_With_All_Fields> {
	int id;
	String name;
	double marks;

	public Student_Comparing_With_All_Fields(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\nStudent_Comparing_With_All_Fields [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	//Comparing based on multiple properties & fields
	public int compareTo(Student_Comparing_With_All_Fields o) {
		int n = 0;
		if (this.marks > o.marks)
			n = 1;
		else if (this.marks < o.marks)
			n = -1;
		else
			n = 0;

		if (n == 0)
			n = this.name.compareTo(o.name);
		if (n == 0)
			n = this.id - o.id;
		return n;

	}

}
