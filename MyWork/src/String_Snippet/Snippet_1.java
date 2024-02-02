package String_Snippet;

public class Snippet_1 {
	public static void main(String args[]) {
//		String c = "Hello i love java";
//		boolean var;
//		var = c.startsWith("hello");
//		System.out.println(var);
//		try {
//			return;
//		}
//		finally {
//			System.out.println("Hi");
//		}
		
		
		int star = 1, space = 4;
		for (int i = 1; i <= 9; i++) {
			
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			if (i <= 4) {
				star++;
				space--;
			} else {
				star--;
				space++;
			}
			System.out.println();
		}
	}
}

/*
 * Output: a. true b. false c. 0 d. 1 Answer:b
 */
