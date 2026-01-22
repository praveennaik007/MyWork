package Comparable_Interface;

public class Student implements Comparable<Student> {
	int id;
	String name;
	double marks;

	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return "\n Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

//		Cmparing Based On Marks
	public int compareTo(Student o) {
		if (this.marks > o.marks)
			return 1;
		if (this.marks < o.marks)
			return -1;
		return 0;
//		return (int)(this.marks-o.marks);
	}
//			Comparing Based on Name
//	public int compareTo(Student o) {
//		return this.name.compareTo(o.name);
//	}
//			Comparing Based On Id
//	public int compareTo(Student o) {
//		if (this.id > o.id)
//			return 1;
//		if (this.id < o.id)
//			return -1;
//		return 0;
//	}

//	public int compareTo(Object o) {
//		Student s = (Student) o;
////		if (this.id > s.id)
////			return 1;
////		if (this.id < s.id)
////			return -1;
////		return 0;
//		return this.id-s.id;
//	}

}
