package encapsulation;

public class Emp_Main {

	public static void main(String[] args) {
		try {
			Employee emp = new Employee(1, "Hello", 45654.99);
			System.out.println(emp.getSal());
		} catch (SalaryIncorrectException s) {
			System.out.println("Salary Not Correct...!!!");
		}

	}
}
