package Exceptions;

import java.io.*;

public class Arithmetic_Exception {
	public static void main(String[] args) throws FileNotFoundException {
		run();
	}

	public static void run() throws FileNotFoundException {
		walk();
	}

	public static void walk() throws FileNotFoundException {
		sleep();
	}

	public static void sleep() throws FileNotFoundException {
		FileInputStream fin = new FileInputStream("C:\\Rough\\P.txt");
		System.out.println("Successfully Completed");
	}

}
