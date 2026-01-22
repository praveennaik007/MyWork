package Rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Propagation {

	public static void main(String[] args)  {
		try {
		System.out.println("Started..!!!");
		FileInputStream fin=new FileInputStream("C:\\M9\\h1.txt");
		System.out.println("Ended...!!!");
		}catch (Exception e) {   
			System.out.println("File Not Found ...!!!");
		}
	}
}
