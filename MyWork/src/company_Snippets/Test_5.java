package company_Snippets;

public class Test_5 {
	public static void main(String[] args) {
		String s1 = new String("Sun Micro Systems");
		String s2 = new String("Sun Micro Systems");
		System.out.println(s1.equals(s2));

		StringBuilder builder1 = new StringBuilder("Sum Micro Systems");
		StringBuilder builder2 = new StringBuilder("Sum Micro Systems");
		System.out.println(builder1);
		System.out.println(builder1.equals(builder2));

		StringBuffer buffer1 = new StringBuffer("Sun Micro Systems");
		StringBuffer buffer2 = new StringBuffer("Sun Micro Systems");
		System.out.println(buffer1.equals(buffer2));
	}
}
