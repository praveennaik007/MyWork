package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example1 {
	public static void main(String[] args) throws FileNotFoundException {
		sleep();
	}

	public static void sleep() throws FileNotFoundException {
		walk();
	}

	public static void walk() throws FileNotFoundException {
		eat();
	}

	public static void eat() throws FileNotFoundException {
		System.out.println(123);
		try {
			FileInputStream fin = new FileInputStream("C://Sample/k.txt");
		} catch (FileNotFoundException e) {
			System.out.println("fgh");
		}
		System.out.println(456);
	}
}
