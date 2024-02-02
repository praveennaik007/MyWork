package File_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Converting_ByteArr_To_String {
	public static void main(String[] args) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("c://sample/p.txt");
//			System.out.println(fin.available());
//			byte b[] = new byte[fin.available()];
			byte b[]="hello world one".getBytes();
			System.out.println(fin.read(b));
			String s = new String(b);
			System.out.println(s);
			
		} catch (IOException e) {
			System.out.println("Nothing is Present ");
		}
	}
}
