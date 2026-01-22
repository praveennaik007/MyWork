package Collection_Listproj;

public class Comparable_In implements Comparable<Comparable_In> {
	private int id;
	private String name;
	private double age;

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

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public Comparable_In(int id, String name, double age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "\nid" +id + " " + name + " " + age;
	}
//	@Override
//	public String toString() {
//		return "\nComparable_In [id=" + id + ", name=" + name + ", age=" + age + "]";
//	}

	@Override
	public int compareTo(Comparable_In s) {
//		if (this.age > s.age) {
//			return 1;
//		}
//		if (this.age < s.age) {
//			return -1;
//		}
//		return 0;
//		return this.name.compareTo(s.name);
		
//		return this.id-s.id;
//		return this.id-s.getId();
		return this.getId() - s.getId();
	}

}
