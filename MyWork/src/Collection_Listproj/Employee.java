package Collection_Listproj;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	double sal;
	String date;

	public Employee(int id, String name, int sal, String date) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.date = date;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", sal=" + sal + ", date=" + date + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}

}
