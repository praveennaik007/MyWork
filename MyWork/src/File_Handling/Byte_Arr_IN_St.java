package File_Handling;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Byte_Arr_IN_St {
	public static void main(String[] args) {
		byte[] a = { 1, 2, 3 };
		int b = 1;
		int c = 0;
		long l = 120;

		ByteArrayInputStream bin = new ByteArrayInputStream(a);
//		System.out.println(bin.read());
//		System.out.println(bin.read());
//		System.out.println(bin.read());
//		System.out.println(bin.read(a, b, c));
		System.out.println(bin.available());
//		System.out.println(bin.markSupported());
//		System.out.println(bin.skip(l));
//		bin.mark(b);
//		System.out.println(bin.read());
//	bin.reset();
//	System.out.println(bin.read());
//	System.out.println("**************");
//		try {
//			bin.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
