package Rough;

public class Hello_World_khoor_zruog {
	public static void main(String[] args) {
//		String s = "hello world";
//		String str = "";
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) != ' ')
//				str = str + (char) (s.charAt(i) + 3);
//		
//		else {
//			System.out.print(str+" ");
//			str="";
//		}
//		}
//		System.out.println(str);

//		int i=3;int j=4;
//		int res=0;
//		for (int k = 1; k <=j; k++) {
//			i=i*2;
//			System.out.print(i+" ");
//
//		}
		String s1 = "aab";
		String s2 = "xxy";
		String s3="";
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				s3+=(char)(s1.charAt(i)+23);
			}
		}
		if(s3.equals(s2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
