package Encapsulation;

public class Emp {
	String name;
	String job;
	private double sal;

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		if (sal > 12000) {
			this.sal = sal;
		} else {
			System.out.println("Save Employee : " + this.name);
		}
	}

	public Emp(String name, String job, double sal) {
		super();
		this.name = name;
		this.job = job;
		if (sal > 12000) {
			this.sal = sal;
		} else {
			System.out.println("Save Employee : " + this.name);
		}

	}

	private void run() {
		System.out.println("name : " + this.name);
		System.out.println("job : " + this.job);
		System.out.println("sal : " + this.sal);
	}
	public void run1() {
		 run();
	}

}
