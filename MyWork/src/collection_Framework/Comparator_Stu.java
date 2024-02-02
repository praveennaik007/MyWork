package collection_Framework;

public class Comparator_Stu {
	int id;
	String name;
	double Marks;

	public Comparator_Stu(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		Marks = marks;
	}

	@Override
	public String toString() {
		return "Comparator_Stu [id=" + id + ", name=" + name + ", Marks=" + Marks + "]";
	}

}
