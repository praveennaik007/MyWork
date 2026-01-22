package Array_One_D;

public class Remove_Duplicates_Array {
	public static void main(String[] args) {
//		int a[] = { 1, 3, 3, 4, 7, 9, 2, 5, 2, 7, 1 };
//		int b[] = new int[a.length];
//		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] == a[j]) {
//					b[j] = -1;
//				}
//			}
//			if (b[i] != -1) {
//				System.out.print(a[i] + " ");
//			}
//		}

//		String s = "my country is india";
//
//		char ch[] = s.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			int c=1;
//			for (int j = i + 1; j < ch.length; j++) {
//				if (ch[i] == ch[j]) {
//					ch[j] = '1';
//					c++;
//				}
//			}
//			if (ch[i] != '1'&&ch[i]!=' ') {
//				System.out.println(ch[i] + " "+c);
//			}
//		}

		int n = 12321, rev = 0,temp=n;
		while (n > 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n /= 10;
		}
		if(rev==temp) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}
