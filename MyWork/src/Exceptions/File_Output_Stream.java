package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class File_Output_Stream {
public static void main(String[] args) throws FileNotFoundException {
	run();
}

private static void run() throws FileNotFoundException {
	m1();
}

private static void m1() throws FileNotFoundException {
	m2();
	
}

private static void m2() throws FileNotFoundException {
	System.out.println("Start");
	FileOutputStream fout=new FileOutputStream("c://Sample/p.txt");
	System.out.println("End");
}
}
