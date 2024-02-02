package Array_Programs;

import java.util.Scanner;

public class Laptop {
	String bN;
	double pS;

	public Laptop(String bN, double pS) {
		super();
		this.bN = bN;
		this.pS = pS;
	}

	static Scanner sc = new Scanner(System.in);

	@Override
	public String toString() {
		return "Laptop [bN=" + bN + ", pS=" + pS + "]";
	}

	public static void main(String[] args) {
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		Laptop[] l = new Laptop[size];
		for (int i = 0; i < l.length; i++) {
			System.out.println("Enter the Name : " + (i + 1));
			String name = sc.next();
			System.out.println("Enter the Price : " + (i + 1));
			double price = sc.nextDouble();
			l[i] = new Laptop(name, price);

		}
		for (int i = 0; i < l.length; i++) {
			System.out.println(l[i]);
		}
	}
}
