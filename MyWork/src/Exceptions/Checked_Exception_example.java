package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked_Exception_example {

	public static void main(String[] args) throws FileNotFoundException {
		run();
	}

	private static void run() throws FileNotFoundException {
		walk();

	}

	private static void walk() throws FileNotFoundException {
		System.out.println("Started");
		try {
		FileInputStream fin = new FileInputStream("C:\\New folder\\hi.txt");
		int i ;
		while((i=fin.read())!=-1) {
			System.out.print((char)(i));
		}
		System.out.println("Over");
		}catch (Exception e) {
			System.out.println("File Not Found");
		}
	}
}
