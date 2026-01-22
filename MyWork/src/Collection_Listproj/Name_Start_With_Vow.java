package Collection_Listproj;

public class Name_Start_With_Vow implements Comparable<Name_Start_With_Vow> {
	int id;
	String name;
	double marks;

	public Name_Start_With_Vow(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return "\nName_Start_With_Vow [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	public int compareTo(Name_Start_With_Vow o) {
		if (this.id > o.id)
			return 1;
		if (this.id < o.id)
			return -1;
		return 0;
	}

}
