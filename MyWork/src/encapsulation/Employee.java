package encapsulation;

public class Employee {
	int id;
	String name;
	private double sal;

	public Employee(int id, String name, double sal) {
		super();
		if (sal >= 45000 && sal <= 50000) {
			this.id = id;
			this.name = name;
			this.sal = sal;
		} else {
			throw new SalaryIncorrectException("Incorrect Salary...!!! ");
		}

	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		if (sal >= 45000 && sal <= 50000) {
			this.sal = sal;
		} else {
			throw new SalaryIncorrectException("Incorrect Salary...!!! ");
		}
	}

}
