package Collection_Listproj;

public class Student_Rank implements Comparable<Student_Rank> {
	int id;
	String name;
	double marks;
	int rank;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Student_Rank(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\nStudent_Rank [id=" + id + ", name=" + name + ", marks=" + marks + ", rank=" + rank + "]";
	}

	@Override
	public int compareTo(Student_Rank o) {
//		int n = 0;
//		if (this.marks > o.marks)
//			n = 1;
//		else if (this.marks < o.marks)
//			n = - 1;
//		else
//			n = 0;
//
//		if (n == 0)
//			n = this.name.compareTo(o.name);
//		if (n == 0)
//			n = this.id - o.id;
//		return n;
//		if (this.getMarks() > o.getMarks())
//			return 1;
//		if (this.getMarks() < o.getMarks())
//			return -1;
//		return 0;
		return this.getName().compareTo(o.getName());
	}

}
