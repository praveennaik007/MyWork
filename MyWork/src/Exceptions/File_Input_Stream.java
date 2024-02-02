package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class File_Input_Stream {
public static void main(String[] args) throws FileNotFoundException {
	System.out.println(1);
	try {
	FileInputStream fin=new FileInputStream("c://Sample1/p.txt");
	}catch(FileNotFoundException e) {
		System.out.println("Check It Once");
	}
	System.out.println("bye");
}
}
