package File_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_IN_St {
	public static void main(String[] args) {
		FileInputStream fin = null;
		try {

			fin = new FileInputStream("c://sample/p.txt");
			int b = 0;
//			while ((b = fin.read()) != -1) {
//				System.out.print((char) b);
//			}
//			while ((b = fin.read()) != -1) {
//				System.out.print(b);
//			}
			int count = 0;
			while ((b = fin.read()) != -1) {
				count++;
//				if (b == '\n') {
//					count++;
//				}
			}
			System.out.println(count);
		} catch (FileNotFoundException e) {
			System.out.println("File is Not Present ");

		} catch (IOException e) {
			System.out.println("we cant read this file");
		} finally {

		}
	}
}
