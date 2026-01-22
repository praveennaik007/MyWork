package Comparator_Interface;

public class Student {
	int id;
	String name;
	double marks;
	String course;

	public Student(int id, String name, double marks, String course) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	public String toString() {
		return "\n Student [id=" + id + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}

}
