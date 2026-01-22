package Method_Non_Primitive_Datatype_As_ReturnType;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	int id;
	String name;
	double sal;

	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	public static List<Employee> details() {
		ArrayList<Employee> al = new ArrayList<Employee>();
		ArrayList<Employee> al1 = new ArrayList<Employee>();

		al.add(new Employee(1, "A", 25000));
		al.add(new Employee(2, "AB", 35000));
		al.add(new Employee(3, "ABC", 50000));
		al.add(new Employee(4, "ABCD", 30000));
		al.add(new Employee(5, "ABCDE", 25000));
		for (int i = 0; i < al.size(); i++) {
			al1.add(al.get(i));
		}
		return al1;
	}

	public static void main(String[] args) {
		System.out.println(details());
	}

}
