package BinaryString;

public class Example {
	public static void main(String[] args) {
		String s = "102101";
//	int n=Integer.parseInt(s);
//	System.out.println(n);//100101
		int count = 0;
		int max = 0;
		for (char c : s.toCharArray()) {
			if (c == '1') {
				count++;
				max = Math.max(max, count);
			} else {
				count = 0;
			}
		}
		System.out.println(max+" "+count);
//		isBinary(s);
		System.out.println(isBinary(s));
	}
	static boolean isBinary(String s) {
	    for (char c : s.toCharArray()) {
	        if (c != '0' && c != '1')
	            return false;
	    }
	    return true;
	}
}
